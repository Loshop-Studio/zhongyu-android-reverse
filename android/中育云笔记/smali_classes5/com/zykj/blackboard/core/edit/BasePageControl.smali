# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public abstract Lcom/zykj/blackboard/core/edit/BasePageControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly9/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/BasePageControl$a;
    }
.end annotation


# static fields
.field public static final m:Lcom/zykj/blackboard/core/edit/BasePageControl$a;


# instance fields
.field public final a:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public b:Lcom/zykj/blackboard/core/data/dao/PageEntity;

.field public final c:Lia/e;

.field public final d:Lia/c;

.field public final e:Lga/c;

.field public final f:Lu9/a;

.field public final g:Lv9/b;

.field public final h:Ly9/k;

.field public final i:Ly9/a;

.field public j:Lr9/a;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/edit/BasePageControl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/edit/BasePageControl$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/blackboard/core/edit/BasePageControl;->m:Lcom/zykj/blackboard/core/edit/BasePageControl$a;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lw9/h;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 8

    .line 1
    const-string v0, "boardControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "renderLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 15
    .line 16
    new-instance v0, Lia/e;

    .line 17
    .line 18
    invoke-direct {v0}, Lia/e;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 22
    .line 23
    new-instance v6, Lia/c;

    .line 24
    .line 25
    invoke-direct {v6, v0}, Lia/c;-><init>(Lia/e;)V

    .line 26
    .line 27
    .line 28
    iput-object v6, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lia/c;

    .line 29
    .line 30
    new-instance v5, Lga/c;

    .line 31
    .line 32
    invoke-direct {v5}, Lga/c;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 36
    .line 37
    new-instance v4, Lu9/a;

    .line 38
    .line 39
    invoke-direct {v4}, Lu9/a;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lu9/a;

    .line 43
    .line 44
    new-instance v2, Lv9/b;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {v2, v4, p2, v0}, Lv9/b;-><init>(Lu9/a;Lw9/h;Lq9/b;)V

    .line 51
    .line 52
    .line 53
    new-instance p2, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;

    .line 54
    .line 55
    invoke-direct {p2, p0}, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;-><init>(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p2}, Lv9/b;->W(Lhd/l;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 62
    .line 63
    new-instance v7, Ly9/k;

    .line 64
    .line 65
    invoke-direct {v7, v2}, Ly9/k;-><init>(Lv9/b;)V

    .line 66
    .line 67
    .line 68
    iput-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->h:Ly9/k;

    .line 69
    .line 70
    new-instance p2, Ly9/a;

    .line 71
    .line 72
    invoke-direct {p2}, Ly9/a;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->i:Ly9/a;

    .line 76
    .line 77
    new-instance v1, Lr9/a;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-direct/range {v1 .. v7}, Lr9/a;-><init>(Lv9/b;Lq9/b;Lu9/a;Lga/d;Lia/c;Ly9/k;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->j:Lr9/a;

    .line 87
    .line 88
    new-instance p1, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->k:Ljava/util/ArrayList;

    .line 94
    .line 95
    new-instance p1, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->l:Ljava/util/ArrayList;

    .line 101
    .line 102
    if-nez p3, :cond_0

    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->b0()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Z(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->I()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_0
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;->f0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Z(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public static synthetic G(Lcom/zykj/blackboard/core/edit/BasePageControl;Lhd/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->g0(Lcom/zykj/blackboard/core/edit/BasePageControl;Lhd/a;)V

    return-void
.end method

.method public static synthetic H(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->c0(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    return-void
.end method

.method public static final c0(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ly9/n;->u()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Ly9/n;->stopRecord()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->k()Lio/objectbox/relation/ToOne;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object p0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Lq9/b;->z()Lq9/d;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->j(Lq9/d;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->i()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    iget-object p0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Lq9/b;->z()Lq9/d;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lna/g;->e(Lq9/d;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->i()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->k()Lio/objectbox/relation/ToOne;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1, p0}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static final g0(Lcom/zykj/blackboard/core/edit/BasePageControl;Lhd/a;)V
    .locals 12

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "\u9875\u9762BasePageControl=>show():\u5f00\u59cb\u52a0\u8f7d\u753b\u677f----["

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, "]:show -> start}"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {v0, v1}, Lga/c;->h(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {v0, v2}, Lv9/b;->l(Z)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Lna/l;->a:Lna/l;

    .line 57
    .line 58
    new-instance v3, Ljava/io/File;

    .line 59
    .line 60
    new-instance v4, Ljava/io/File;

    .line 61
    .line 62
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 63
    .line 64
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/edit/BoardControl;->n()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v5, "snapshot.bin"

    .line 76
    .line 77
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    const-string v4, "File(\n                  \u2026           ).absolutePath"

    .line 85
    .line 86
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3}, Lna/l;->e(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    if-eqz v3, :cond_0

    .line 94
    .line 95
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    if-eqz v4, :cond_0

    .line 100
    .line 101
    invoke-virtual {v4}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    goto :goto_0

    .line 106
    :cond_0
    move v4, v2

    .line 107
    :goto_0
    if-eqz v3, :cond_3

    .line 108
    .line 109
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v5}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-gtz v5, :cond_1

    .line 118
    .line 119
    move v5, v1

    .line 120
    goto :goto_1

    .line 121
    :cond_1
    move v5, v2

    .line 122
    :goto_1
    if-nez v5, :cond_2

    .line 123
    .line 124
    move v6, v1

    .line 125
    goto :goto_2

    .line 126
    :cond_2
    move v6, v2

    .line 127
    goto :goto_2

    .line 128
    :cond_3
    move v5, v2

    .line 129
    move v6, v5

    .line 130
    :goto_2
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    if-eqz v7, :cond_4

    .line 137
    .line 138
    invoke-static {v7}, Lna/n;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-ne v7, v1, :cond_4

    .line 143
    .line 144
    move v7, v1

    .line 145
    goto :goto_3

    .line 146
    :cond_4
    move v7, v2

    .line 147
    :goto_3
    if-eqz v3, :cond_5

    .line 148
    .line 149
    if-eqz v6, :cond_5

    .line 150
    .line 151
    if-nez v7, :cond_5

    .line 152
    .line 153
    move v8, v1

    .line 154
    goto :goto_4

    .line 155
    :cond_5
    move v8, v2

    .line 156
    :goto_4
    if-eqz v3, :cond_6

    .line 157
    .line 158
    if-eqz v6, :cond_6

    .line 159
    .line 160
    if-eqz v7, :cond_6

    .line 161
    .line 162
    move v6, v1

    .line 163
    goto :goto_5

    .line 164
    :cond_6
    move v6, v2

    .line 165
    :goto_5
    const-string v7, "\uff0csnapshotGraphCount="

    .line 166
    .line 167
    const-string v9, "\uff0cpage="

    .line 168
    .line 169
    if-eqz v6, :cond_7

    .line 170
    .line 171
    new-instance v10, Ljava/lang/StringBuilder;

    .line 172
    .line 173
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 174
    .line 175
    .line 176
    const-string v11, "\u9875\u9762BasePageControl.kt -> MatrixAutoRepair\uff0c\u77e9\u9635\u6b63\u5e38\uff0c\u672a\u89e6\u53d1\u81ea\u52a8\u4fee\u590d\uff0cpageDir="

    .line 177
    .line 178
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_7
    if-eqz v8, :cond_8

    .line 217
    .line 218
    new-instance v10, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 221
    .line 222
    .line 223
    const-string v11, "\u9875\u9762BasePageControl.kt -> MatrixAutoRepair\uff0c\u68c0\u6d4b\u5230\u76f8\u673a\u77e9\u9635\u5f02\u5e38\uff0c\u89e6\u53d1\u81ea\u52a8\u4fee\u590d\uff0cpageDir="

    .line 224
    .line 225
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 263
    .line 264
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/edit/BoardControl;->o()Lma/a;

    .line 265
    .line 266
    .line 267
    :cond_8
    :goto_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 268
    .line 269
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 270
    .line 271
    .line 272
    const-string v7, " \u9875\u9762BasePageControl=>show():\u5f53\u65f6\u662f\u5426\u5b58\u5728\u5feb\u7167"

    .line 273
    .line 274
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    const-string v4, "info"

    .line 292
    .line 293
    const/4 v7, 0x6

    .line 294
    const-string v10, "\u9875\u9762BasePageControl["

    .line 295
    .line 296
    if-eqz v6, :cond_d

    .line 297
    .line 298
    new-instance v5, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v6, "]:show -> \u4ece\u5feb\u7167\u8fdb\u884c\u52a0\u8f7d}"

    .line 314
    .line 315
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lu9/a;

    .line 330
    .line 331
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->f()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    const-string v8, "localGraphSnapshot!!.cameraMatrix"

    .line 339
    .line 340
    invoke-static {v6, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-static {v6}, Lna/n;->g(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    invoke-virtual {v5, v6}, Lu9/a;->j(Landroid/graphics/Matrix;)V

    .line 348
    .line 349
    .line 350
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 351
    .line 352
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    const-string v6, "localGraphSnapshot.graphSnapshot"

    .line 357
    .line 358
    invoke-static {v3, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v0, v5, v3}, Lna/l;->a(Lga/d;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lba/a;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    if-eqz v0, :cond_9

    .line 366
    .line 367
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 368
    .line 369
    invoke-virtual {v3, v0}, Lv9/b;->E(Lba/c;)V

    .line 370
    .line 371
    .line 372
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->h()Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-eqz v0, :cond_14

    .line 381
    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 385
    .line 386
    .line 387
    const-string v3, "\u9875\u9762BasePageControl ["

    .line 388
    .line 389
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string v3, "]:show -> \u5b58\u5728\u672a\u4fdd\u5b58\u6570\u636e\u5e93\u6570\u636e\uff0c\u7ee7\u7eed\u4ece\u6570\u636e\u5e93\u52a0\u8f7d}"

    .line 400
    .line 401
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    sget-object v0, Lz9/b;->a:Lz9/b;

    .line 416
    .line 417
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 418
    .line 419
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lu9/a;

    .line 420
    .line 421
    iget-object v6, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 422
    .line 423
    invoke-virtual {v0, v7, v3, v5, v6}, Lz9/b;->a(ILga/d;Lu9/a;Lv9/c;)Lz9/a;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-virtual {v3}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 440
    .line 441
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    move v5, v2

    .line 450
    :cond_a
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    if-eqz v6, :cond_14

    .line 455
    .line 456
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    check-cast v6, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 461
    .line 462
    if-eqz v5, :cond_b

    .line 463
    .line 464
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result v7

    .line 476
    if-eqz v7, :cond_a

    .line 477
    .line 478
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    check-cast v7, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 483
    .line 484
    invoke-static {v7, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v7}, Lz9/a;->d(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 488
    .line 489
    .line 490
    goto :goto_8

    .line 491
    :cond_b
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->b()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v7

    .line 495
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->b()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    invoke-static {v7, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v7

    .line 507
    if-eqz v7, :cond_a

    .line 508
    .line 509
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->c()I

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    invoke-static {v7}, Lrc/w;->p(Ljava/util/List;)I

    .line 522
    .line 523
    .line 524
    move-result v7

    .line 525
    if-gt v5, v7, :cond_c

    .line 526
    .line 527
    :goto_9
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 528
    .line 529
    .line 530
    move-result-object v8

    .line 531
    invoke-virtual {v8, v5}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v8

    .line 535
    const-string v9, "it.commandInfoEntity[i]"

    .line 536
    .line 537
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    check-cast v8, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 541
    .line 542
    invoke-virtual {v0, v8}, Lz9/a;->d(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 543
    .line 544
    .line 545
    if-eq v5, v7, :cond_c

    .line 546
    .line 547
    add-int/lit8 v5, v5, 0x1

    .line 548
    .line 549
    goto :goto_9

    .line 550
    :cond_c
    move v5, v1

    .line 551
    goto :goto_7

    .line 552
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 553
    .line 554
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    const-string v3, "]:show -> \u4ece\u547d\u4ee4\u884c\u52a0\u8f7d}"

    .line 568
    .line 569
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    sget-object v0, Lz9/b;->a:Lz9/b;

    .line 584
    .line 585
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 586
    .line 587
    iget-object v6, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lu9/a;

    .line 588
    .line 589
    iget-object v11, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 590
    .line 591
    invoke-virtual {v0, v7, v3, v6, v11}, Lz9/b;->a(ILga/d;Lu9/a;Lv9/c;)Lz9/a;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    invoke-virtual {v3}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 608
    .line 609
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 610
    .line 611
    .line 612
    move-result-object v3

    .line 613
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 618
    .line 619
    .line 620
    move-result v6

    .line 621
    if-eqz v6, :cond_f

    .line 622
    .line 623
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v6

    .line 627
    check-cast v6, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 628
    .line 629
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v6

    .line 637
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 638
    .line 639
    .line 640
    move-result v7

    .line 641
    if-eqz v7, :cond_e

    .line 642
    .line 643
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    check-cast v7, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 648
    .line 649
    invoke-static {v7, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v7}, Lz9/a;->d(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 653
    .line 654
    .line 655
    goto :goto_a

    .line 656
    :cond_f
    if-eqz v5, :cond_11

    .line 657
    .line 658
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 659
    .line 660
    invoke-virtual {v0}, Lv9/b;->n()Lba/c;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    if-eqz v0, :cond_10

    .line 665
    .line 666
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    if-eqz v0, :cond_10

    .line 671
    .line 672
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    goto :goto_b

    .line 677
    :cond_10
    move v0, v2

    .line 678
    :goto_b
    if-lez v0, :cond_11

    .line 679
    .line 680
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 681
    .line 682
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->o()Lma/a;

    .line 683
    .line 684
    .line 685
    :cond_11
    if-eqz v8, :cond_14

    .line 686
    .line 687
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 688
    .line 689
    invoke-virtual {v0}, Lv9/b;->n()Lba/c;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    if-eqz v0, :cond_12

    .line 694
    .line 695
    invoke-interface {v0}, Lba/c;->f()Ljava/util/List;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    if-eqz v0, :cond_12

    .line 700
    .line 701
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    goto :goto_c

    .line 706
    :cond_12
    move v0, v2

    .line 707
    :goto_c
    const-string v3, "\uff0crepairedGraphCount="

    .line 708
    .line 709
    if-lez v0, :cond_13

    .line 710
    .line 711
    new-instance v4, Ljava/lang/StringBuilder;

    .line 712
    .line 713
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 714
    .line 715
    .line 716
    const-string v5, "\u9875\u9762BasePageControl.kt -> MatrixAutoRepair\uff0c\u81ea\u52a8\u4fee\u590d\u5b8c\u6210\uff0c\u5df2\u4ece\u547d\u4ee4\u91cd\u5efa\u5e76\u5c06\u4fdd\u5b58\u65b0\u5feb\u7167\uff0cpageDir="

    .line 717
    .line 718
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 719
    .line 720
    .line 721
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v5

    .line 735
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 742
    .line 743
    .line 744
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    goto :goto_d

    .line 756
    :cond_13
    new-instance v4, Ljava/lang/StringBuilder;

    .line 757
    .line 758
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 759
    .line 760
    .line 761
    const-string v5, "\u9875\u9762BasePageControl.kt -> MatrixAutoRepair\uff0c\u81ea\u52a8\u4fee\u590d\u5931\u8d25\uff0c\u4ece\u547d\u4ee4\u91cd\u5efa\u540e\u4ecd\u65e0\u56fe\u5143\uff0cpageDir="

    .line 762
    .line 763
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    .line 765
    .line 766
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v5

    .line 770
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v5

    .line 780
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 781
    .line 782
    .line 783
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    :cond_14
    :goto_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 801
    .line 802
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    .line 807
    .line 808
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v3

    .line 812
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    const-string v3, "]:show -> \u521d\u59cb\u5316\u5b8c\u6bd5, g:"

    .line 816
    .line 817
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 821
    .line 822
    invoke-virtual {v3}, Lv9/b;->n()Lba/c;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    if-eqz v3, :cond_15

    .line 827
    .line 828
    invoke-interface {v3}, Lba/c;->f()Ljava/util/List;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    if-eqz v3, :cond_15

    .line 833
    .line 834
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 835
    .line 836
    .line 837
    move-result v3

    .line 838
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 839
    .line 840
    .line 841
    move-result-object v3

    .line 842
    goto :goto_e

    .line 843
    :cond_15
    const/4 v3, 0x0

    .line 844
    :goto_e
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 859
    .line 860
    invoke-virtual {v0, v1}, Lv9/b;->l(Z)V

    .line 861
    .line 862
    .line 863
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 864
    .line 865
    invoke-virtual {v0}, Lv9/b;->g()V

    .line 866
    .line 867
    .line 868
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 869
    .line 870
    invoke-virtual {v0}, Lv9/b;->Z()V

    .line 871
    .line 872
    .line 873
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->d0()V

    .line 874
    .line 875
    .line 876
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 877
    .line 878
    invoke-virtual {v0, v2}, Lga/c;->h(Z)V

    .line 879
    .line 880
    .line 881
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 882
    .line 883
    invoke-virtual {v0}, Lga/c;->f()V

    .line 884
    .line 885
    .line 886
    invoke-interface {p1}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    new-instance p1, Ljava/lang/StringBuilder;

    .line 890
    .line 891
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 892
    .line 893
    .line 894
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object p0

    .line 901
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    .line 903
    .line 904
    const-string p0, "]:show -> end}"

    .line 905
    .line 906
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 907
    .line 908
    .line 909
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object p0

    .line 913
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object p0

    .line 917
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    return-void
.end method


# virtual methods
.method public final I()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lia/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->k()Lcom/zykj/board/EzyRectF$RectF$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v2, -0x800001

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->r(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->u(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->t(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->p(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/zykj/board/EzyRectF$RectF$b;->d()Lcom/zykj/board/EzyRectF$RectF;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v0, "newBuilder().setLeft(-Fl\u2026(Float.MAX_VALUE).build()"

    .line 40
    .line 41
    invoke-static {v4, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    const-string v2, ""

    .line 49
    .line 50
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->B(Ljava/lang/String;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Lcom/zykj/board/EzyRectF$RectF;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->M([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->c:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 63
    .line 64
    const-string v2, "graphData"

    .line 65
    .line 66
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lga/d;)Lba/a;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->F()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v2, v0, v1}, Lv9/b;->f(Ljava/lang/String;Lba/c;)V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void
.end method

.method public final J(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->g()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->c()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->d()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    add-long/2addr v4, v6

    .line 68
    add-long/2addr v0, v4

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-wide v0
.end method

.method public final K(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 52
    .line 53
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->g()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->c()J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->d()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    add-long/2addr v4, v6

    .line 68
    add-long/2addr v0, v4

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-wide v0
.end method

.method public final L(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    const-string v1, "randomUUID().toString()"

    .line 12
    .line 13
    invoke-static {v5, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v11, "BasePageControl:createPageEntity ["

    .line 22
    .line 23
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, "]:\u521b\u5efa\u65b0Entity"

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 46
    .line 47
    const/16 v9, 0x1c

    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    const/4 v8, 0x0

    .line 55
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/PageEntity;-><init>(JLjava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/n;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/edit/BasePageControl;->f0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v12, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 70
    .line 71
    const/16 v27, 0x3fc

    .line 72
    .line 73
    const/16 v28, 0x0

    .line 74
    .line 75
    const-wide/16 v13, 0x0

    .line 76
    .line 77
    const/4 v15, 0x6

    .line 78
    const/16 v16, 0x0

    .line 79
    .line 80
    const/16 v17, 0x0

    .line 81
    .line 82
    const-wide/16 v18, 0x0

    .line 83
    .line 84
    const-wide/16 v20, 0x0

    .line 85
    .line 86
    const-wide/16 v22, 0x0

    .line 87
    .line 88
    const/16 v24, 0x0

    .line 89
    .line 90
    const/16 v25, 0x0

    .line 91
    .line 92
    const/16 v26, 0x0

    .line 93
    .line 94
    invoke-direct/range {v12 .. v28}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;-><init>(JIIIJJJLjava/lang/String;IIILkotlin/jvm/internal/n;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 98
    .line 99
    .line 100
    move-result-wide v2

    .line 101
    invoke-virtual {v12, v2, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->r(J)V

    .line 102
    .line 103
    .line 104
    const-wide/16 v2, 0x0

    .line 105
    .line 106
    invoke-virtual {v12, v2, v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->t(J)V

    .line 107
    .line 108
    .line 109
    iget-object v4, v0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 110
    .line 111
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v4}, Lq9/b;->M()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->y(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Lq9/b;->u()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->u(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Lq9/b;->h()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->s(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Lq9/b;->h()I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->w(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->k()Lio/objectbox/relation/ToOne;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-virtual {v4}, Lq9/b;->z()Lq9/d;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-static {v7}, Lna/g;->e(Lq9/d;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->i()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->e()Lio/objectbox/relation/ToOne;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v4}, Lq9/b;->j()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-static {v7}, Lna/g;->d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->j()Lio/objectbox/relation/ToOne;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v4}, Lq9/b;->j()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-static {v7}, Lna/g;->d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->a()Lio/objectbox/relation/ToOne;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v4}, Lq9/b;->g()Lq9/a;

    .line 202
    .line 203
    .line 204
    const/4 v4, 0x0

    .line 205
    invoke-virtual {v6, v4}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->l()Lio/objectbox/relation/ToOne;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v12}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 234
    .line 235
    const/4 v7, 0x1

    .line 236
    invoke-direct {v6, v2, v3, v7, v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;-><init>(JILkotlin/jvm/internal/n;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->g()Lio/objectbox/relation/ToOne;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->j()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v6}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->a()Lio/objectbox/relation/ToOne;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    move-object/from16 v2, p1

    .line 265
    .line 266
    invoke-virtual {v1, v2}, Lio/objectbox/relation/ToOne;->o(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->i()V

    .line 274
    .line 275
    .line 276
    new-instance v1, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    const-string v2, "]:\u521b\u5efa\u5b8c\u6210,id:"

    .line 288
    .line 289
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->f()J

    .line 297
    .line 298
    .line 299
    move-result-wide v2

    .line 300
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    return-object v1
.end method

.method public final M()Lr9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->j:Lr9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()Ly9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->i:Ly9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Lcom/zykj/blackboard/core/edit/BoardControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Lv9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q()Ly9/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->h:Ly9/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R()Lu9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lu9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final S()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final T()Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->b:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "pageEntity"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final U()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->n()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "File(boardControl.getBoa\u2026ity.dirName).absolutePath"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final V()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W()Lia/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lia/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final X()Lga/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Y()Lia/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Z(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 4

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->a0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->j:Lr9/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr9/a;->t()Lr9/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p0, v0}, Ly9/n;->D(Lma/b;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/zykj/blackboard/core/edit/BasePageControl$b;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl$b;-><init>(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v0}, Ly9/n;->D(Lma/b;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lia/c;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "pageEntity.recordEntity.target"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lia/c;->d(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lga/c;

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lga/c;->g(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->i:Ly9/a;

    .line 56
    .line 57
    sget-object v1, Lia/c;->d:Lia/c$a;

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    sget-object v3, Lcom/zykj/blackboard/enums/DocumentType;->d:Lcom/zykj/blackboard/enums/DocumentType;

    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Lia/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ly9/a;->a(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->h0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->i0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final a0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->d()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lv9/b;->U(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->i()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Lv9/b;->d(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->e()Lio/objectbox/relation/ToOne;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {v0}, Lna/g;->b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lv9/b;->V(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->j()Lio/objectbox/relation/ToOne;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 64
    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-static {v0}, Lna/g;->b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lv9/b;->s(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->k()Lio/objectbox/relation/ToOne;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Lq9/b;->z()Lq9/d;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1, v0}, Lq9/d;->h(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->p()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->g()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lq9/b;->M()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lq9/b;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lq9/b;->u()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    const/16 v9, 0x70

    .line 132
    .line 133
    const/4 v10, 0x0

    .line 134
    const/4 v6, 0x0

    .line 135
    const/4 v7, 0x0

    .line 136
    const/4 v8, 0x0

    .line 137
    invoke-static/range {v2 .. v10}, Ly9/o;->c(IIIIZIIILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lu9/a;

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lu9/a;->k(Landroid/graphics/Matrix;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public b(Lhd/a;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Thread;

    .line 7
    .line 8
    new-instance v1, Ly9/b;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Ly9/b;-><init>(Lcom/zykj/blackboard/core/edit/BasePageControl;Lhd/a;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b0()Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .locals 3

    .line 1
    sget-object v0, Lna/d;->a:Lna/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lna/d;->f()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljc/a;->o()Lio/objectbox/query/QueryBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "builder"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->h:Lio/objectbox/Property;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->n()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v1, v2}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->e()Lio/objectbox/query/Query;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "builder.build()"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lio/objectbox/query/Query;->n()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->L(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    const-string v1, "BasePageControl:initPageEntity ["

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, "] \u6ca1\u627e\u5230boardEntity:"

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 83
    .line 84
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->n()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Ljava/lang/NullPointerException;

    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    const-string v2, "empty boardEntity: "

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->n()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0
.end method

.method public final d0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv9/b;->n()Lba/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->h:Ly9/k;

    .line 10
    .line 11
    check-cast v0, Lba/a;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 14
    .line 15
    invoke-virtual {v2}, Lv9/b;->L()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 20
    .line 21
    invoke-virtual {v3}, Lv9/b;->M()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v1, v0, v2, v3}, Ly9/k;->d(Lba/a;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final e0(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 3

    .line 1
    const-string v0, "originMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lia/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->x(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;J)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final f0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->b:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 7
    .line 8
    return-void
.end method

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final h0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, Lrc/g0;->z0(Ljava/util/List;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->b()[B

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->u([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Ljava/io/File;

    .line 46
    .line 47
    sget-object v2, Lia/c;->d:Lia/c$a;

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    sget-object v4, Lcom/zykj/blackboard/enums/DocumentType;->d:Lcom/zykj/blackboard/enums/DocumentType;

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, Lia/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance v2, Landroid/media/MediaPlayer;

    .line 74
    .line 75
    invoke-direct {v2}, Landroid/media/MediaPlayer;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v2, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepare()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    int-to-long v1, v1

    .line 93
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->m()J

    .line 94
    .line 95
    .line 96
    move-result-wide v3

    .line 97
    cmp-long v3, v3, v1

    .line 98
    .line 99
    if-eqz v3, :cond_1

    .line 100
    .line 101
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->o()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v3, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->r(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->p(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v3, "builder.build().toByteArray()"

    .line 124
    .line 125
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v0}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->i([B)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v1, v2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->j(J)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->h()V

    .line 135
    .line 136
    .line 137
    :cond_1
    :goto_0
    return-void
.end method

.method public hide()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv9/b;->Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->y(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lu9/a;

    .line 17
    .line 18
    invoke-virtual {v0}, Lu9/a;->d()Landroid/graphics/Matrix;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-static {v0, v2, v3}, Lna/n;->f(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->w(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 29
    .line 30
    .line 31
    sget-object v0, Lna/p;->a:Lna/p$a;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->U()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->d()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v3, "builder.build()"

    .line 42
    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v3, "snapshot.bin"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v3, v1}, Lna/p$a;->b(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->h()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->j(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, ""

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->k(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/4 v1, -0x1

    .line 83
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->l(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->i()V

    .line 91
    .line 92
    .line 93
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 94
    .line 95
    invoke-virtual {v0}, Lv9/b;->Q()V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final i0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->f()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->K(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->J(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    cmp-long p1, v0, v2

    .line 24
    .line 25
    if-ltz p1, :cond_0

    .line 26
    .line 27
    cmp-long p1, v0, v4

    .line 28
    .line 29
    if-ltz p1, :cond_0

    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Lia/e;->d(J)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 37
    .line 38
    sub-long v4, v0, v4

    .line 39
    .line 40
    invoke-virtual {p1, v4, v5}, Lia/e;->g(J)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 44
    .line 45
    sub-long/2addr v0, v2

    .line 46
    invoke-virtual {p1, v0, v1}, Lia/e;->h(J)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    cmp-long p1, v2, v4

    .line 51
    .line 52
    if-lez p1, :cond_1

    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 55
    .line 56
    invoke-virtual {p1, v2, v3}, Lia/e;->d(J)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 60
    .line 61
    sub-long/2addr v2, v4

    .line 62
    invoke-virtual {p1, v2, v3}, Lia/e;->g(J)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_1
    cmp-long p1, v4, v2

    .line 67
    .line 68
    if-lez p1, :cond_2

    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 71
    .line 72
    invoke-virtual {p1, v4, v5}, Lia/e;->d(J)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lia/c;

    .line 76
    .line 77
    invoke-virtual {p1}, Lia/c;->c()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sub-long/2addr v4, v2

    .line 82
    invoke-virtual {p1, v4, v5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->e0(J)V

    .line 83
    .line 84
    .line 85
    :cond_2
    return-void
.end method

.method public onDelete()V
    .locals 2

    .line 1
    sget-object v0, Lna/d;->a:Lna/d;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lna/d;->e(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public release()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Ly9/c;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ly9/c;-><init>(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->j:Lr9/a;

    .line 15
    .line 16
    invoke-virtual {v0}, Lr9/a;->t()Lr9/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p0, v0}, Ly9/n;->B(Lma/b;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lv9/b;

    .line 24
    .line 25
    invoke-virtual {v0}, Lv9/b;->Q()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public w()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lia/e;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lia/e;->c(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method
