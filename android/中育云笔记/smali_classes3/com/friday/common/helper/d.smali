.class public final Lcom/friday/common/helper/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/helper/d$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/friday/common/helper/d$a;

.field public static final e:I

.field public static volatile f:Lcom/friday/common/helper/d;


# instance fields
.field public final a:Lqc/d;

.field public final b:I

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/helper/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/helper/d$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/helper/d;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lf2/h;

    invoke-direct {v0}, Lf2/h;-><init>()V

    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    move-result-object v0

    iput-object v0, p0, Lcom/friday/common/helper/d;->a:Lqc/d;

    const/4 v0, 0x3

    .line 4
    iput v0, p0, Lcom/friday/common/helper/d;->b:I

    const-wide/16 v0, 0x3e8

    .line 5
    iput-wide v0, p0, Lcom/friday/common/helper/d;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/helper/d;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/helper/d;->i(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/helper/d;->j(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c()Lje/v;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/common/helper/d;->m()Lje/v;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic d()Lcom/friday/common/helper/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/common/helper/d;->f:Lcom/friday/common/helper/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic e(Lcom/friday/common/helper/d;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/friday/common/helper/d;->f:Lcom/friday/common/helper/d;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    move-object p3, p1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/common/helper/d;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final i(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/helper/d;->p(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final j(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/helper/d;->p(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final m()Lje/v;
    .locals 1

    .line 1
    new-instance v0, Lje/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lje/v;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final f(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, "placeholder.jpg"

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ResourceUtils;->copyFileFromAssets(Ljava/lang/String;Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-static {v1, p1}, Lcom/blankj/utilcode/util/FileUtils;->copy(Ljava/lang/String;Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "localUrl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "backupUrl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v0, p0, Lcom/friday/common/helper/d;->b:I

    .line 17
    .line 18
    new-instance v1, Lf2/f;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1, p2}, Lf2/f;-><init>(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, Lcom/friday/common/helper/d;->n(ILhd/a;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, p1}, Lcom/friday/common/helper/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p0, v0}, Lcom/friday/common/helper/d;->l(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    new-instance v0, Lf2/g;

    .line 53
    .line 54
    invoke-direct {v0, p0, p3, p2}, Lf2/g;-><init>(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    invoke-virtual {p0, v1, v0}, Lcom/friday/common/helper/d;->n(ILhd/a;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :cond_1
    invoke-virtual {p0, p2}, Lcom/friday/common/helper/d;->f(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v1, "\u56fe\u7247\u4e0b\u8f7d\u5931\u8d25\uff0c\u4f7f\u7528\u5360\u4f4d\u56fe. url="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p1, ", backupUrl="

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p1, ", localUrl="

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_2
    new-instance p2, Ljava/lang/Exception;

    .line 110
    .line 111
    new-instance p3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v0, "\u4e0b\u8f7d\u6b21\u6570\u8d85\u8fc7\u4e0a\u9650\u5e76\u4e14\u975e\u56fe\u7247\u8d44\u6e90\u6587\u4ef6: "

    .line 117
    .line 118
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p2
.end method

.method public final k()Lje/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/helper/d;->a:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lje/v;

    .line 8
    .line 9
    return-object v0
.end method

.method public final l(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "jpg"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "png"

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "webp"

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1
    :goto_0
    return v1
.end method

.method public final n(ILhd/a;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge v1, p1, :cond_2

    .line 4
    .line 5
    invoke-interface {p2}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    add-int/lit8 v2, p1, -0x1

    .line 20
    .line 21
    if-ge v1, v2, :cond_1

    .line 22
    .line 23
    iget-wide v2, p0, Lcom/friday/common/helper/d;->c:J

    .line 24
    .line 25
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 26
    .line 27
    .line 28
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v0
.end method

.method public final o(Lje/y;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lje/y;->e()Lje/z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lje/z;->byteStream()Ljava/io/InputStream;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromIS(Ljava/lang/String;Ljava/io/InputStream;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    .line 19
    .line 20
    const-string p2, "\u5199\u5165\u6587\u4ef6\u5931\u8d25"

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/Exception;

    .line 27
    .line 28
    const-string p2, "Response body \u4e3a\u7a7a"

    .line 29
    .line 30
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lcom/friday/common/helper/b;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Lcom/friday/common/helper/d;->k()Lje/v;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lje/w$a;

    .line 17
    .line 18
    invoke-direct {v2}, Lje/w$a;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p1}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lje/w$a;->b()Lje/w;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Lje/v;->b(Lje/w;)Lje/e;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Lje/e;->execute()Lje/y;

    .line 34
    .line 35
    .line 36
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    :try_start_1
    invoke-virtual {v1}, Lje/y;->s()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x0

    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1}, Lje/y;->j()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v1}, Lje/y;->t()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v5, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v6, "\u4e0b\u8f7d\u5931\u8d25 url="

    .line 58
    .line 59
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v6, " code="

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v2, " msg="

    .line 74
    .line 75
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->w([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    .line 91
    .line 92
    :try_start_2
    invoke-static {v1, v3}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 93
    .line 94
    .line 95
    return v0

    .line 96
    :catch_0
    move-exception v1

    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v2

    .line 99
    goto :goto_0

    .line 100
    :cond_0
    :try_start_3
    invoke-virtual {p0, v1, p2}, Lcom/friday/common/helper/d;->o(Lje/y;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 101
    .line 102
    .line 103
    const/4 v2, 0x1

    .line 104
    :try_start_4
    invoke-static {v1, v3}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 105
    .line 106
    .line 107
    return v2

    .line 108
    :goto_0
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 109
    :catchall_1
    move-exception v3

    .line 110
    :try_start_6
    invoke-static {v1, v2}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    throw v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 114
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    new-instance v3, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    const-string v4, "\u4e0b\u8f7d\u5f02\u5e38 realUrl="

    .line 124
    .line 125
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p1, " local="

    .line 132
    .line 133
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string p1, " "

    .line 140
    .line 141
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->w([Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    return v0
.end method
