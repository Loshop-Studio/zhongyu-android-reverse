# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public abstract Lcom/zykj/blackboard/core/edit/BasePageControl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln4/h;


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

.field public final c:Lx4/e;

.field public final d:Lx4/c;

.field public final e:Lv4/c;

.field public final f:Lj4/a;

.field public final g:Lk4/b;

.field public final h:Ln4/f;

.field public final i:Ln4/a;

.field public j:Lg4/a;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/blackboard/core/edit/BasePageControl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/edit/BasePageControl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/blackboard/core/edit/BasePageControl;->m:Lcom/zykj/blackboard/core/edit/BasePageControl$a;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BoardControl;Ll4/j;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 8

    .line 1
    const-string v0, "boardControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "renderLayer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    new-instance v0, Lx4/e;

    .line 17
    .line 18
    invoke-direct {v0}, Lx4/e;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 22
    .line 23
    new-instance v6, Lx4/c;

    .line 24
    .line 25
    invoke-direct {v6, v0}, Lx4/c;-><init>(Lx4/e;)V

    .line 26
    .line 27
    .line 28
    iput-object v6, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lx4/c;

    .line 29
    .line 30
    new-instance v5, Lv4/c;

    .line 31
    .line 32
    invoke-direct {v5}, Lv4/c;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 36
    .line 37
    new-instance v4, Lj4/a;

    .line 38
    .line 39
    invoke-direct {v4}, Lj4/a;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lj4/a;

    .line 43
    .line 44
    new-instance v2, Lk4/b;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-direct {v2, v4, p2, v0}, Lk4/b;-><init>(Lj4/a;Ll4/j;Lcom/zykj/blackboard/bean/BoardConfig;)V

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
    invoke-virtual {v2, p2}, Lk4/b;->S(Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    iput-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 62
    .line 63
    new-instance v7, Ln4/f;

    .line 64
    .line 65
    invoke-direct {v7, v2}, Ln4/f;-><init>(Lk4/b;)V

    .line 66
    .line 67
    .line 68
    iput-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->h:Ln4/f;

    .line 69
    .line 70
    new-instance p2, Ln4/a;

    .line 71
    .line 72
    invoke-direct {p2}, Ln4/a;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->i:Ln4/a;

    .line 76
    .line 77
    new-instance v1, Lg4/a;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-direct/range {v1 .. v7}, Lg4/a;-><init>(Lk4/b;Lcom/zykj/blackboard/bean/BoardConfig;Lj4/a;Lv4/d;Lx4/c;Ln4/f;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->j:Lg4/a;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->a0()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Y(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->H()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_0
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;->e0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p3}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Y(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public static synthetic F(Lcom/zykj/blackboard/core/edit/BasePageControl;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->f0(Lcom/zykj/blackboard/core/edit/BasePageControl;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic G(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->b0(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    return-void
.end method

.method public static final b0(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ln4/i;->w()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Ln4/i;->stopRecord()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->j(Lf4/c;)V

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Le5/f;->e(Lf4/c;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

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
    invoke-virtual {v1, p0}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public static final f0(Lcom/zykj/blackboard/core/edit/BasePageControl;Lkotlin/jvm/functions/Function0;)V
    .locals 10

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-virtual {v0, v1}, Lv4/c;->h(Z)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {v0, v2}, Lk4/b;->i(Z)V

    .line 54
    .line 55
    .line 56
    sget-object v0, Le5/k;->a:Le5/k;

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
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/edit/BoardControl;->h()Ljava/lang/String;

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
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v3}, Le5/k;->e(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    const-string v4, "\u9875\u9762BasePageControl["

    .line 94
    .line 95
    if-eqz v3, :cond_3

    .line 96
    .line 97
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->r()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-lez v5, :cond_0

    .line 106
    .line 107
    move v5, v1

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    move v5, v2

    .line 110
    :goto_0
    xor-int/lit8 v6, v5, 0x1

    .line 111
    .line 112
    if-eqz v5, :cond_4

    .line 113
    .line 114
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v5}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const/4 v7, 0x0

    .line 123
    cmpg-float v5, v5, v7

    .line 124
    .line 125
    if-nez v5, :cond_1

    .line 126
    .line 127
    move v5, v1

    .line 128
    goto :goto_1

    .line 129
    :cond_1
    move v5, v2

    .line 130
    :goto_1
    if-eqz v5, :cond_2

    .line 131
    .line 132
    new-instance v7, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v8, "]:show -> \u76f8\u673a\u77e9\u9635\u5f02\u5e38}"

    .line 148
    .line 149
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    invoke-static {v7}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object v7, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 164
    .line 165
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/edit/BoardControl;->i()Lc5/a;

    .line 166
    .line 167
    .line 168
    :cond_2
    if-nez v5, :cond_4

    .line 169
    .line 170
    move v5, v1

    .line 171
    goto :goto_2

    .line 172
    :cond_3
    move v6, v2

    .line 173
    :cond_4
    move v5, v2

    .line 174
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    .line 178
    .line 179
    const-string v8, " \u9875\u9762BasePageControl=>show():\u5f53\u65f6\u662f\u5426\u5b58\u5728\u5feb\u7167"

    .line 180
    .line 181
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-static {v7}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const-string v7, "info"

    .line 199
    .line 200
    const/4 v8, 0x6

    .line 201
    if-eqz v5, :cond_9

    .line 202
    .line 203
    new-instance v5, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string v4, "]:show -> \u4ece\u5feb\u7167\u8fdb\u884c\u52a0\u8f7d}"

    .line 219
    .line 220
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lj4/a;

    .line 235
    .line 236
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->m()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    const-string v6, "localGraphSnapshot!!.cameraMatrix"

    .line 244
    .line 245
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v5}, Le5/m;->d(Lcom/zykj/board/EzyMatrix$Matrix;)Landroid/graphics/Matrix;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    invoke-virtual {v4, v5}, Lj4/a;->j(Landroid/graphics/Matrix;)V

    .line 253
    .line 254
    .line 255
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 256
    .line 257
    invoke-virtual {v3}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->r()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    const-string v5, "localGraphSnapshot.graphSnapshot"

    .line 262
    .line 263
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v4, v3}, Le5/k;->a(Lv4/d;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lq4/a;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    if-eqz v0, :cond_5

    .line 271
    .line 272
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 273
    .line 274
    invoke-virtual {v3, v0}, Lk4/b;->p(Lq4/c;)V

    .line 275
    .line 276
    .line 277
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->h()Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_d

    .line 286
    .line 287
    new-instance v0, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    const-string v3, "\u9875\u9762BasePageControl ["

    .line 293
    .line 294
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v3, "]:show -> \u5b58\u5728\u672a\u4fdd\u5b58\u6570\u636e\u5e93\u6570\u636e\uff0c\u7ee7\u7eed\u4ece\u6570\u636e\u5e93\u52a0\u8f7d}"

    .line 305
    .line 306
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    sget-object v0, Lo4/b;->a:Lo4/b;

    .line 321
    .line 322
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 323
    .line 324
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lj4/a;

    .line 325
    .line 326
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 327
    .line 328
    invoke-virtual {v0, v8, v3, v4, v5}, Lo4/b;->a(ILv4/d;Lj4/a;Lk4/c;)Lo4/a;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    invoke-virtual {v3}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 345
    .line 346
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    move v4, v2

    .line 355
    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    if-eqz v5, :cond_d

    .line 360
    .line 361
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 366
    .line 367
    if-eqz v4, :cond_7

    .line 368
    .line 369
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-eqz v6, :cond_6

    .line 382
    .line 383
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    check-cast v6, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 388
    .line 389
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v6}, Lo4/a;->d(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 393
    .line 394
    .line 395
    goto :goto_4

    .line 396
    :cond_7
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->b()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v6

    .line 400
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 401
    .line 402
    .line 403
    move-result-object v8

    .line 404
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->b()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v6

    .line 412
    if-eqz v6, :cond_6

    .line 413
    .line 414
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->c()I

    .line 419
    .line 420
    .line 421
    move-result v4

    .line 422
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 423
    .line 424
    .line 425
    move-result-object v6

    .line 426
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    if-gt v4, v6, :cond_8

    .line 431
    .line 432
    :goto_5
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 433
    .line 434
    .line 435
    move-result-object v8

    .line 436
    invoke-virtual {v8, v4}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v8

    .line 440
    const-string v9, "it.commandInfoEntity[i]"

    .line 441
    .line 442
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    check-cast v8, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 446
    .line 447
    invoke-virtual {v0, v8}, Lo4/a;->d(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 448
    .line 449
    .line 450
    if-eq v4, v6, :cond_8

    .line 451
    .line 452
    add-int/lit8 v4, v4, 0x1

    .line 453
    .line 454
    goto :goto_5

    .line 455
    :cond_8
    move v4, v1

    .line 456
    goto :goto_3

    .line 457
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 458
    .line 459
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    const-string v3, "]:show -> \u4ece\u547d\u4ee4\u884c\u52a0\u8f7d}"

    .line 473
    .line 474
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    sget-object v0, Lo4/b;->a:Lo4/b;

    .line 489
    .line 490
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 491
    .line 492
    iget-object v4, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lj4/a;

    .line 493
    .line 494
    iget-object v5, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 495
    .line 496
    invoke-virtual {v0, v8, v3, v4, v5}, Lo4/b;->a(ILv4/d;Lj4/a;Lk4/c;)Lo4/a;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-virtual {v3}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 513
    .line 514
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->b()Lio/objectbox/relation/ToMany;

    .line 515
    .line 516
    .line 517
    move-result-object v3

    .line 518
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    if-eqz v4, :cond_b

    .line 527
    .line 528
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 533
    .line 534
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->a()Lio/objectbox/relation/ToMany;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    if-eqz v5, :cond_a

    .line 547
    .line 548
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v5

    .line 552
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 553
    .line 554
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v5}, Lo4/a;->d(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 558
    .line 559
    .line 560
    goto :goto_6

    .line 561
    :cond_b
    if-eqz v6, :cond_d

    .line 562
    .line 563
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 564
    .line 565
    invoke-virtual {v0}, Lk4/b;->n()Lq4/c;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    if-eqz v0, :cond_c

    .line 570
    .line 571
    invoke-interface {v0}, Lq4/c;->f()Ljava/util/List;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    if-eqz v0, :cond_c

    .line 576
    .line 577
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 578
    .line 579
    .line 580
    move-result v0

    .line 581
    goto :goto_7

    .line 582
    :cond_c
    move v0, v2

    .line 583
    :goto_7
    if-lez v0, :cond_d

    .line 584
    .line 585
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 586
    .line 587
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->i()Lc5/a;

    .line 588
    .line 589
    .line 590
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 591
    .line 592
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 593
    .line 594
    .line 595
    const-string v3, "\u9875\u9762BasePageControl.kt -> ["

    .line 596
    .line 597
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v3

    .line 604
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    const-string v3, "]:show -> \u521d\u59cb\u5316\u5b8c\u6bd5, g:"

    .line 608
    .line 609
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 613
    .line 614
    invoke-virtual {v3}, Lk4/b;->n()Lq4/c;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    if-eqz v3, :cond_e

    .line 619
    .line 620
    invoke-interface {v3}, Lq4/c;->f()Ljava/util/List;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    if-eqz v3, :cond_e

    .line 625
    .line 626
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 631
    .line 632
    .line 633
    move-result-object v3

    .line 634
    goto :goto_8

    .line 635
    :cond_e
    const/4 v3, 0x0

    .line 636
    :goto_8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 651
    .line 652
    invoke-virtual {v0, v1}, Lk4/b;->i(Z)V

    .line 653
    .line 654
    .line 655
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 656
    .line 657
    invoke-virtual {v0}, Lk4/b;->e()V

    .line 658
    .line 659
    .line 660
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 661
    .line 662
    invoke-virtual {v0}, Lk4/b;->V()V

    .line 663
    .line 664
    .line 665
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->c0()V

    .line 666
    .line 667
    .line 668
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 669
    .line 670
    invoke-virtual {v0, v2}, Lv4/c;->h(Z)V

    .line 671
    .line 672
    .line 673
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 674
    .line 675
    invoke-virtual {v0}, Lv4/c;->f()V

    .line 676
    .line 677
    .line 678
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    new-instance p1, Ljava/lang/StringBuilder;

    .line 682
    .line 683
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 684
    .line 685
    .line 686
    const-string v0, "\u9875\u9762BasePageControl.kt-> ["

    .line 687
    .line 688
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getFileName()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object p0

    .line 695
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    const-string p0, "]:show -> end}"

    .line 699
    .line 700
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 701
    .line 702
    .line 703
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object p0

    .line 707
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object p0

    .line 711
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    return-void
.end method


# virtual methods
.method public final H()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lx4/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v3, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->q()Lcom/zykj/board/EzyRectF$RectF$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v2, -0x800001

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->s(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->v(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->u(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0, v2}, Lcom/zykj/board/EzyRectF$RectF$b;->q(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Lcom/zykj/board/EzyRectF$RectF$b;->c()Lcom/zykj/board/EzyRectF$RectF;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const-string v0, "newBuilder().setLeft(-Fl\u2026(Float.MAX_VALUE).build()"

    .line 40
    .line 41
    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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
    sget-object v1, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->a:Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;

    .line 63
    .line 64
    const-string v2, "graphData"

    .line 65
    .line 66
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lv4/d;)Lq4/a;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->F()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v2, v0, v1}, Lk4/b;->y(Ljava/lang/String;Lq4/c;)V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void
.end method

.method public final I(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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

.method public final J(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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

.method public final K(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;
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
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/PageEntity;-><init>(JLjava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/edit/BasePageControl;->e0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-direct/range {v12 .. v28}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;-><init>(JIIIJJJLjava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->x(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->u(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundColor()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-virtual {v12, v6}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->s(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundColor()I

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
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 148
    .line 149
    .line 150
    move-result-object v7

    .line 151
    invoke-static {v7}, Le5/f;->e(Lf4/c;)Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->i()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->e()Lio/objectbox/relation/ToOne;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-static {v7}, Le5/f;->d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->j()Lio/objectbox/relation/ToOne;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-static {v7}, Le5/f;->d(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    invoke-virtual {v7}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->f()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->a()Lio/objectbox/relation/ToOne;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v4}, Lcom/zykj/blackboard/bean/BoardConfig;->getAuthor()Lf4/a;

    .line 202
    .line 203
    .line 204
    const/4 v4, 0x0

    .line 205
    invoke-virtual {v6, v4}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->l()Lio/objectbox/relation/ToOne;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    invoke-virtual {v6, v7}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->q()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v12}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-direct {v6, v2, v3, v7, v4}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;-><init>(JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->g()Lio/objectbox/relation/ToOne;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->j()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v6}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {v1, v2}, Lio/objectbox/relation/ToOne;->t(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    return-object v1
.end method

.method public final L()Lg4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->j:Lg4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()Ln4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->i:Ln4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()Lcom/zykj/blackboard/core/edit/BoardControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Lk4/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()Ln4/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->h:Ln4/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q()Lj4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lj4/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->l:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final S()Lcom/zykj/blackboard/core/data/dao/PageEntity;
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
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final T()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->h()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final U()Ljava/util/ArrayList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final V()Lx4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lx4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W()Lv4/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final X()Lx4/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Y(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 4

    .line 1
    const-string v0, "pageEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->Z(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->j:Lg4/a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lg4/a;->u()Lg4/e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p0, v0}, Ln4/i;->k(Lc5/b;)V

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
    invoke-interface {p0, v0}, Ln4/i;->k(Lc5/b;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lx4/c;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "pageEntity.recordEntity.target"

    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lx4/c;->c(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->e:Lv4/c;

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Lv4/c;->g(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->i:Ln4/a;

    .line 56
    .line 57
    sget-object v1, Lx4/c;->d:Lx4/c$a;

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    sget-object v3, Lcom/zykj/blackboard/enums/DocumentType;->b:Lcom/zykj/blackboard/enums/DocumentType;

    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Lx4/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0, v1}, Ln4/a;->a(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->g0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->h0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final Z(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->d()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lk4/b;->Q(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->i()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {v0, v1}, Lk4/b;->c(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->e()Lio/objectbox/relation/ToOne;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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
    invoke-static {v0}, Le5/f;->b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lk4/b;->R(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

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
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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
    invoke-static {v0}, Le5/f;->b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Lk4/b;->t(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

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
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BoardConfig;->getMoveActionConfig()Lf4/c;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v1, v0}, Lf4/c;->h(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)V

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
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Lcom/zykj/blackboard/bean/BoardConfig;->getHeight()I

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
    invoke-static/range {v2 .. v10}, Ln4/j;->c(IIIIZIIILjava/lang/Object;)Landroid/graphics/Matrix;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lj4/a;

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lj4/a;->k(Landroid/graphics/Matrix;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final a0()Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .locals 3

    .line 1
    sget-object v0, Le5/c;->a:Le5/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Le5/c;->b()Lio/objectbox/BoxStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-class v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->h(Ljava/lang/Class;)Lq8/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "BoardBox.boxStore.boxFor\u2026kBoardEntity::class.java)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lq8/a;->n()Lio/objectbox/query/QueryBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "builder"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->f:Lio/objectbox/Property;

    .line 28
    .line 29
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->a:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->h()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v1, v2}, Lio/objectbox/query/QueryBuilder;->g(Lio/objectbox/Property;Ljava/lang/String;)Lio/objectbox/query/QueryBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lio/objectbox/query/QueryBuilder;->a()Lio/objectbox/query/Query;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "builder.build()"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lio/objectbox/query/Query;->p()Ljava/lang/Object;

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
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->K(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->h()Ljava/lang/String;

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
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->h()Ljava/lang/String;

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

.method public b(Lkotlin/jvm/functions/Function0;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Thread;

    .line 7
    .line 8
    new-instance v1, Ln4/b;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Ln4/b;-><init>(Lcom/zykj/blackboard/core/edit/BasePageControl;Lkotlin/jvm/functions/Function0;)V

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

.method public final c0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk4/b;->n()Lq4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->h:Ln4/f;

    .line 10
    .line 11
    check-cast v0, Lq4/a;

    .line 12
    .line 13
    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 14
    .line 15
    invoke-virtual {v2}, Lk4/b;->getBackgroundColor()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 20
    .line 21
    invoke-virtual {v3}, Lk4/b;->J()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v1, v0, v2, v3}, Ln4/f;->c(Lq4/a;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final d0(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 3

    .line 1
    const-string v0, "originMatrix"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "lastMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lx4/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

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

.method public final e0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->b:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 7
    .line 8
    return-void
.end method

.method public final g0(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

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
    invoke-static {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->x([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Ljava/io/File;

    .line 46
    .line 47
    sget-object v2, Lx4/c;->d:Lx4/c$a;

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    sget-object v4, Lcom/zykj/blackboard/enums/DocumentType;->b:Lcom/zykj/blackboard/enums/DocumentType;

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, Lx4/c$a;->a(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

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
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->r()J

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
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->t()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

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
    invoke-virtual {v3, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->s(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->q(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

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
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->e()Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->j()Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->J(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->I(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

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
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Lx4/e;->d(J)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 37
    .line 38
    sub-long v4, v0, v4

    .line 39
    .line 40
    invoke-virtual {p1, v4, v5}, Lx4/e;->g(J)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 44
    .line 45
    sub-long/2addr v0, v2

    .line 46
    invoke-virtual {p1, v0, v1}, Lx4/e;->h(J)V

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
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 55
    .line 56
    invoke-virtual {p1, v2, v3}, Lx4/e;->d(J)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 60
    .line 61
    sub-long/2addr v2, v4

    .line 62
    invoke-virtual {p1, v2, v3}, Lx4/e;->g(J)V

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
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 71
    .line 72
    invoke-virtual {p1, v4, v5}, Lx4/e;->d(J)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->d:Lx4/c;

    .line 76
    .line 77
    invoke-virtual {p1}, Lx4/c;->b()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    sub-long/2addr v4, v2

    .line 82
    invoke-virtual {p1, v4, v5}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->d0(J)V

    .line 83
    .line 84
    .line 85
    :cond_2
    return-void
.end method

.method public hide()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk4/b;->U()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->t()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->z(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->f:Lj4/a;

    .line 17
    .line 18
    invoke-virtual {v0}, Lj4/a;->d()Landroid/graphics/Matrix;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-wide/16 v2, 0x0

    .line 23
    .line 24
    invoke-static {v0, v2, v3}, Le5/m;->c(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->x(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 29
    .line 30
    .line 31
    sget-object v0, Le5/o;->a:Le5/o$a;

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->T()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->c()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v3, "builder.build()"

    .line 42
    .line 43
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v3, "snapshot.bin"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v3, v1}, Le5/o$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 94
    .line 95
    invoke-virtual {v0}, Lk4/b;->M()V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public onDelete()V
    .locals 2

    .line 1
    sget-object v0, Le5/c;->a:Le5/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Le5/c;->a(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

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
    new-instance v1, Ln4/c;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Ln4/c;-><init>(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

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
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->j:Lg4/a;

    .line 15
    .line 16
    invoke-virtual {v0}, Lg4/a;->u()Lg4/e;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {p0, v0}, Ln4/i;->B(Lc5/b;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->g:Lk4/b;

    .line 24
    .line 25
    invoke-virtual {v0}, Lk4/b;->M()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public x()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl;->c:Lx4/e;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lx4/e;->c(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method
