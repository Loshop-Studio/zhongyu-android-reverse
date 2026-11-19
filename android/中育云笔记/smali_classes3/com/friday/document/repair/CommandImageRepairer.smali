# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox、文件流。
.class public final Lcom/friday/document/repair/CommandImageRepairer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/repair/CommandImageRepairer$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/friday/document/repair/CommandImageRepairer;

.field public static final b:Lqc/d;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/repair/CommandImageRepairer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/repair/CommandImageRepairer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/friday/document/repair/CommandImageRepairer;->a:Lcom/friday/document/repair/CommandImageRepairer;

    .line 7
    .line 8
    new-instance v0, Lr2/a;

    .line 9
    .line 10
    invoke-direct {v0}, Lr2/a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/friday/document/repair/CommandImageRepairer;->b:Lqc/d;

    .line 18
    .line 19
    const/16 v0, 0x8

    .line 20
    .line 21
    sput v0, Lcom/friday/document/repair/CommandImageRepairer;->c:I

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Lje/v;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/document/repair/CommandImageRepairer;->h()Lje/v;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Ljava/io/File;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/repair/CommandImageRepairer;->j(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Lcom/friday/document/repair/CommandImageRepairer;Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/friday/document/repair/CommandImageRepairer;->l(Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final h()Lje/v;
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

.method public static final j(Ljava/io/File;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    const/16 v0, 0x24

    .line 16
    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method


# virtual methods
.method public final d(Ljava/io/File;Ljava/lang/String;Ljava/util/List;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "res/image/"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    invoke-interface {p3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method public final e()Lje/v;
    .locals 1

    .line 1
    sget-object v0, Lcom/friday/document/repair/CommandImageRepairer;->b:Lqc/d;

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

.method public final f(Ljava/lang/String;)Z
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

.method public final g(Lcom/friday/common/entity/ResourceEntity;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2, p4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance p4, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "/"

    .line 36
    .line 37
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    const/4 v1, 0x2

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-static {p2, p4, v0, v1, v2}, Lqd/z;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_0

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance p2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string p4, "\\"

    .line 65
    .line 66
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p1, p2, v0, v1, v2}, Lqd/z;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    :cond_0
    const/4 p1, 0x1

    .line 83
    return p1

    .line 84
    :cond_1
    return v0
.end method

.method public final i(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;-><init>(Lcom/friday/document/repair/CommandImageRepairer;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->k:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->m:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget p1, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->j:I

    .line 39
    .line 40
    iget p2, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->i:I

    .line 41
    .line 42
    iget-object p3, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->h:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p3, Ljava/io/File;

    .line 45
    .line 46
    iget-object p3, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p3, [Ljava/io/File;

    .line 49
    .line 50
    iget-object v2, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->f:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/io/File;

    .line 53
    .line 54
    iget-object v4, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Lcom/friday/common/dao/ResourceDao;

    .line 57
    .line 58
    iget-object v5, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Ljava/util/List;

    .line 61
    .line 62
    iget-object v6, v0, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, Lcom/friday/common/entity/FileEntity;

    .line 65
    .line 66
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v9, v0

    .line 70
    move-object v8, v4

    .line 71
    move-object v7, v5

    .line 72
    move-object v5, v6

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_2
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance p4, Ljava/io/File;

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-direct {p4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_3

    .line 99
    .line 100
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_3
    new-instance v2, Lr2/b;

    .line 104
    .line 105
    invoke-direct {v2}, Lr2/b;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p4, v2}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-nez v2, :cond_4

    .line 113
    .line 114
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_4
    array-length v4, v2

    .line 118
    const/4 v5, 0x0

    .line 119
    move-object v7, p2

    .line 120
    move-object v8, p3

    .line 121
    move-object v9, v0

    .line 122
    move-object p3, v2

    .line 123
    move p2, v5

    .line 124
    move-object v5, p1

    .line 125
    move-object v2, p4

    .line 126
    move p1, v4

    .line 127
    :goto_1
    if-ge p2, p1, :cond_6

    .line 128
    .line 129
    aget-object v6, p3, p2

    .line 130
    .line 131
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iput-object v5, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->c:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v7, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->d:Ljava/lang/Object;

    .line 137
    .line 138
    iput-object v8, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->e:Ljava/lang/Object;

    .line 139
    .line 140
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    iput-object p4, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->f:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object p3, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->g:Ljava/lang/Object;

    .line 147
    .line 148
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p4

    .line 152
    iput-object p4, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->h:Ljava/lang/Object;

    .line 153
    .line 154
    iput p2, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->i:I

    .line 155
    .line 156
    iput p1, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->j:I

    .line 157
    .line 158
    iput v3, v9, Lcom/friday/document/repair/CommandImageRepairer$repairMissingCommandImages$1;->m:I

    .line 159
    .line 160
    move-object v4, p0

    .line 161
    invoke-virtual/range {v4 .. v9}, Lcom/friday/document/repair/CommandImageRepairer;->l(Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p4

    .line 165
    if-ne p4, v1, :cond_5

    .line 166
    .line 167
    return-object v1

    .line 168
    :cond_5
    :goto_2
    add-int/2addr p2, v3

    .line 169
    goto :goto_1

    .line 170
    :cond_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 171
    .line 172
    return-object p1
.end method

.method public final k(Lcom/friday/common/entity/FileEntity;Ljava/lang/String;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v2, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    move-object v1, p1

    .line 14
    move-object v3, p3

    .line 15
    move-object v4, p4

    .line 16
    move-object v5, p5

    .line 17
    invoke-virtual/range {v0 .. v5}, Lcom/friday/document/repair/CommandImageRepairer;->l(Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 32
    .line 33
    return-object p1
.end method

.method public final l(Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/util/List;Lcom/friday/common/dao/ResourceDao;Lvc/c;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v0, p5

    const-string v3, "iterator(...)"

    instance-of v4, v0, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;

    iget v5, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->v:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->v:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;

    invoke-direct {v4, v1, v0}, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;-><init>(Lcom/friday/document/repair/CommandImageRepairer;Lvc/c;)V

    :goto_0
    iget-object v0, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->t:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v5

    .line 1
    iget v6, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->v:I

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v6, :cond_4

    if-eq v6, v9, :cond_3

    if-eq v6, v8, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->l:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->k:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->j:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->i:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->h:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->g:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->f:Ljava/lang/Object;

    check-cast v2, Lcom/friday/common/dao/ResourceDao;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->d:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->c:Ljava/lang/Object;

    check-cast v2, Lcom/friday/common/entity/FileEntity;

    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->r:Ljava/lang/Object;

    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->q:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->p:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->o:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->n:Ljava/lang/Object;

    check-cast v2, Lcom/friday/document/repair/CommandImageRepairer$a;

    iget-object v3, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->m:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v6, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->l:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->k:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->j:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->i:Ljava/lang/Object;

    check-cast v13, Ljava/io/File;

    iget-object v14, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->h:Ljava/lang/Object;

    check-cast v14, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v15, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->g:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v7, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->f:Ljava/lang/Object;

    check-cast v7, Lcom/friday/common/dao/ResourceDao;

    iget-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->e:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    move/from16 v17, v9

    iget-object v9, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->d:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    iget-object v10, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->c:Ljava/lang/Object;

    check-cast v10, Lcom/friday/common/entity/FileEntity;

    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v11

    const/4 v11, 0x2

    goto/16 :goto_e

    :catch_0
    move-exception v0

    move-object/from16 v16, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    const/4 v11, 0x2

    goto/16 :goto_12

    :cond_3
    move/from16 v17, v9

    iget-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->k:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->j:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v6, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->i:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    iget-object v7, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->h:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->g:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->f:Ljava/lang/Object;

    check-cast v9, Lcom/friday/common/dao/ResourceDao;

    iget-object v10, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->e:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->d:Ljava/lang/Object;

    check-cast v11, Ljava/io/File;

    iget-object v12, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->c:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/entity/FileEntity;

    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_4
    move/from16 v17, v9

    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v7, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 4
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u9875\u9762CommandImageRepairer.kt -> [\u5f00\u59cb\u68c0\u67e5] \u9875\u9762="

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 5
    new-instance v6, Ljava/io/File;

    const-string v0, "page_mdb"

    invoke-direct {v6, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 6
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 7
    :try_start_1
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/a;->y()Ljc/c;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljc/c;->f(Ljava/io/File;)Ljc/c;

    move-result-object v0

    invoke-virtual {v0}, Ljc/c;->b()Lio/objectbox/BoxStore;

    move-result-object v0

    .line 8
    const-class v9, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    invoke-virtual {v0, v9}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    move-result-object v9

    .line 9
    invoke-virtual {v9}, Ljc/a;->e()Ljava/util/List;

    move-result-object v9

    .line 10
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 11
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->g()Lio/objectbox/relation/ToOne;

    move-result-object v10

    invoke-virtual {v10}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    if-eqz v10, :cond_5

    .line 12
    invoke-virtual {v10}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->c()Lio/objectbox/relation/ToMany;

    move-result-object v10

    invoke-virtual {v10}, Lio/objectbox/relation/ToMany;->iterator()Ljava/util/Iterator;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 13
    invoke-virtual {v11}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->a()Lio/objectbox/relation/ToMany;

    move-result-object v11

    invoke-virtual {v11}, Lio/objectbox/relation/ToMany;->iterator()Ljava/util/Iterator;

    move-result-object v11

    invoke-static {v11, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 14
    invoke-virtual {v12}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->a()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_7

    .line 15
    invoke-virtual {v1, v12}, Lcom/friday/document/repair/CommandImageRepairer;->f(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_7

    .line 16
    iget v13, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    add-int/lit8 v13, v13, 0x1

    iput v13, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 17
    invoke-virtual {v1, v2, v12, v8}, Lcom/friday/document/repair/CommandImageRepairer;->d(Ljava/io/File;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    .line 18
    :cond_8
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_6

    .line 19
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u9875\u9762CommandImageRepairer.kt -> \u8bfb\u53d6 page_mdb \u5931\u8d25: "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    goto/16 :goto_6

    .line 20
    :cond_9
    new-instance v0, Ljava/io/File;

    const-string v3, "router.bin"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 22
    :try_start_2
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 23
    :try_start_3
    invoke-static {v3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->U(Ljava/io/InputStream;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->I()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 25
    invoke-virtual {v9}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_a

    .line 26
    sget-object v10, Lcom/friday/document/repair/CommandImageRepairer;->a:Lcom/friday/document/repair/CommandImageRepairer;

    invoke-virtual {v10, v9}, Lcom/friday/document/repair/CommandImageRepairer;->f(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 27
    iget v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    add-int/lit8 v11, v11, 0x1

    iput v11, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 28
    invoke-virtual {v10, v2, v9, v8}, Lcom/friday/document/repair/CommandImageRepairer;->d(Ljava/io/File;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v9, v0

    goto :goto_4

    .line 29
    :cond_b
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v9, 0x0

    .line 30
    :try_start_4
    invoke-static {v3, v9}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_5

    :goto_4
    :try_start_5
    throw v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-static {v3, v9}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 31
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u9875\u9762CommandImageRepairer.kt -> \u8bfb\u53d6 router.bin \u5931\u8d25: "

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 32
    :cond_c
    :goto_6
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v3, "\u9875\u9762CommandImageRepairer.kt -> [\u68c0\u67e5\u5b8c\u6bd5] \u9875\u9762="

    if-eqz v0, :cond_d

    .line 33
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iget v2, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " \u5b8c\u6574\u672a\u7f3a\u5931\u3002\u5171\u89e3\u6790\u5f15\u7528\u56fe\u7247\u6570: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 34
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    .line 35
    :cond_d
    move-object/from16 v0, p3

    check-cast v0, Ljava/lang/Iterable;

    .line 36
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/friday/common/entity/ResourceEntity;

    .line 38
    invoke-virtual {v11}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    .line 39
    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 40
    :cond_f
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 41
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v12, 0x0

    :goto_8
    if-ge v12, v10, :cond_15

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    add-int/lit8 v12, v12, 0x1

    .line 42
    check-cast v13, Ljava/lang/String;

    .line 43
    new-instance v14, Ljava/io/File;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "res/image/"

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v14, v2, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v14}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    .line 44
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v15, 0x0

    :goto_9
    if-ge v15, v14, :cond_12

    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v20, v6

    move-object/from16 v6, v19

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    .line 45
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    move-result v21

    if-nez v21, :cond_10

    .line 46
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    move-result-object v21

    invoke-interface/range {v21 .. v21}, Ljava/lang/CharSequence;->length()I

    move-result v21

    if-lez v21, :cond_10

    move-object/from16 v21, v8

    .line 47
    sget-object v8, Lcom/friday/document/repair/CommandImageRepairer;->a:Lcom/friday/document/repair/CommandImageRepairer;

    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v8, v6, v2, v13, v11}, Lcom/friday/document/repair/CommandImageRepairer;->g(Lcom/friday/common/entity/ResourceEntity;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_a

    :cond_10
    move-object/from16 v21, v8

    :cond_11
    move-object/from16 v6, v20

    move-object/from16 v8, v21

    goto :goto_9

    :cond_12
    move-object/from16 v20, v6

    move-object/from16 v21, v8

    const/16 v19, 0x0

    .line 48
    :goto_a
    move-object/from16 v6, v19

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    if-nez v6, :cond_13

    .line 49
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u9875\u9762CommandImageRepairer.kt -> \u8df3\u8fc7\u65e0\u53ef\u6062\u590d\u8d44\u6e90\u7684\u5386\u53f2\u56fe\u7247\u5f15\u7528\uff0clocal="

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    const/4 v8, 0x0

    goto :goto_b

    .line 50
    :cond_13
    new-instance v8, Lcom/friday/document/repair/CommandImageRepairer$a;

    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-direct {v8, v11, v6}, Lcom/friday/document/repair/CommandImageRepairer$a;-><init>(Ljava/lang/String;Lcom/friday/common/entity/ResourceEntity;)V

    :goto_b
    if-eqz v8, :cond_14

    .line 51
    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_14
    move-object/from16 v6, v20

    move-object/from16 v8, v21

    goto/16 :goto_8

    :cond_15
    move-object/from16 v20, v6

    move-object/from16 v21, v8

    .line 52
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_16

    .line 53
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iget v2, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " \u4ec5\u53d1\u73b0\u5386\u53f2\u56fe\u7247\u5f15\u7528\uff0c\u65e0\u53ef\u6062\u590d\u7f3a\u5931\u56fe\u7247\u3002\u5171\u89e3\u6790\u5f15\u7528\u56fe\u7247\u6570: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 54
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    .line 55
    :cond_16
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    iget v8, v7, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u9875\u9762CommandImageRepairer.kt -> [\u53d1\u73b0\u7f3a\u5931] \u9875\u9762="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " \u7f3a\u5931\u6570="

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " / \u5f15\u7528\u56fe\u7247\u603b\u6570="

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->w([Ljava/lang/Object;)V

    .line 56
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    move-result-object v3

    new-instance v6, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$3;

    const/4 v8, 0x0

    invoke-direct {v6, v8}, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$3;-><init>(Lvc/c;)V

    move-object/from16 v8, p1

    iput-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->c:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->d:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->e:Ljava/lang/Object;

    move-object/from16 v10, p4

    iput-object v10, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->f:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->g:Ljava/lang/Object;

    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->i:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->j:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->k:Ljava/lang/Object;

    move/from16 v11, v17

    iput v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->v:I

    invoke-static {v3, v6, v4}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_17

    goto/16 :goto_13

    :cond_17
    move-object v11, v2

    move-object v12, v8

    move-object v3, v9

    move-object v9, v10

    move-object/from16 v6, v20

    move-object/from16 v8, v21

    move-object/from16 v10, p3

    move-object v2, v0

    .line 57
    :goto_c
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 58
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move-object v14, v7

    move-object v15, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v2

    move-object v12, v3

    move-object v3, v13

    move-object v13, v6

    move-object v6, v0

    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/friday/document/repair/CommandImageRepairer$a;

    .line 59
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->b()Lcom/friday/common/entity/ResourceEntity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    move-result-object v0

    move-object/from16 p1, v8

    .line 60
    :try_start_7
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->a()Ljava/lang/String;

    move-result-object v8
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    move-object/from16 p2, v11

    :try_start_8
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    move-object/from16 p3, v12

    :try_start_9
    const-string v12, "\u9875\u9762CommandImageRepairer.kt -> \u51c6\u5907\u4e25\u683c\u4e0b\u8f7d\u7f3a\u5931\u56fe\u7247\uff0clocal="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\uff0cossUrl="

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 61
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v0, v8}, Lcom/friday/document/repair/CommandImageRepairer;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_19

    .line 63
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->a()Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u9875\u9762CommandImageRepairer.kt -> \u4e0b\u8f7d\u7f3a\u5931\u56fe\u7247\u6210\u529f: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 64
    iget v8, v6, Lkotlin/jvm/internal/Ref$IntRef;->c:I
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    const/16 v17, 0x1

    add-int/lit8 v8, v8, 0x1

    :try_start_a
    iput v8, v6, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 65
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->b()Lcom/friday/common/entity/ResourceEntity;

    move-result-object v8

    invoke-virtual {v8}, Lcom/friday/common/entity/ResourceEntity;->getPageIndex()I

    move-result v22

    .line 66
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v11, "yyyy-MM-dd HH:mm:ss"

    sget-object v12, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {v8, v11, v12}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v11, Ljava/util/Date;

    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    invoke-virtual {v8, v11}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v30

    .line 67
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v24

    .line 68
    new-instance v18, Lcom/friday/common/entity/ResourceEntity;

    .line 69
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->a()Ljava/lang/String;

    move-result-object v19

    .line 70
    invoke-virtual {v10}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v20

    .line 71
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    const-string v11, "getAbsolutePath(...)"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 73
    sget-object v11, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    invoke-virtual {v11}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    move-result-object v11

    invoke-virtual {v11}, Lcom/friday/common/helper/b;->t()J

    move-result-wide v25

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v27, 0x0

    move-object/from16 v31, v30

    move-object/from16 v23, v0

    move-object/from16 v21, v8

    .line 74
    invoke-direct/range {v18 .. v31}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v8, v18

    move/from16 v0, v22

    .line 75
    iput-object v10, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->c:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->d:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->e:Ljava/lang/Object;

    iput-object v7, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->f:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->g:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->h:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->i:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->j:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->k:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->l:Ljava/lang/Object;

    iput-object v3, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->m:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->n:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->o:Ljava/lang/Object;

    invoke-static/range {v30 .. v30}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->p:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->q:Ljava/lang/Object;

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->r:Ljava/lang/Object;

    iput v0, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->s:I
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    const/4 v11, 0x2

    :try_start_b
    iput v11, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->v:I

    invoke-interface {v7, v8, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3

    if-ne v0, v5, :cond_18

    goto/16 :goto_13

    :cond_18
    move-object/from16 v8, p1

    move-object/from16 v0, p2

    move-object/from16 v12, p3

    :goto_e
    move-object v11, v0

    goto/16 :goto_d

    :catch_3
    move-exception v0

    :goto_f
    move-object/from16 v8, p1

    move-object/from16 v12, p2

    move-object/from16 v16, v15

    move-object v15, v14

    move-object v14, v13

    move-object/from16 v13, p3

    goto :goto_12

    :catch_4
    move-exception v0

    const/4 v11, 0x2

    goto :goto_f

    :catch_5
    move-exception v0

    :goto_10
    const/4 v11, 0x2

    const/16 v17, 0x1

    goto :goto_f

    :cond_19
    const/16 v17, 0x1

    move-object/from16 v8, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    goto/16 :goto_d

    :catch_6
    move-exception v0

    :goto_11
    move-object/from16 p3, v12

    goto :goto_10

    :catch_7
    move-exception v0

    move-object/from16 p2, v11

    goto :goto_11

    .line 76
    :goto_12
    invoke-virtual {v2}, Lcom/friday/document/repair/CommandImageRepairer$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u9875\u9762CommandImageRepairer.kt -> \u4e0b\u8f7d\u7f3a\u5931\u56fe\u7247\u5931\u8d25: "

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", error: "

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    move-object/from16 v1, p0

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    goto/16 :goto_d

    :cond_1a
    move-object/from16 p1, v8

    move-object/from16 p2, v11

    move-object/from16 p3, v12

    .line 77
    iget v0, v6, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    if-lez v0, :cond_1c

    .line 78
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    move-result-object v0

    new-instance v1, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;

    const/4 v8, 0x0

    invoke-direct {v1, v6, v8}, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$4;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lvc/c;)V

    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->c:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->d:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->e:Ljava/lang/Object;

    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->f:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->g:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->h:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->i:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->j:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->k:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->l:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->m:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->n:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->o:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->p:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->q:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->r:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, v4, Lcom/friday/document/repair/CommandImageRepairer$repairPageImages$1;->v:I

    invoke-static {v0, v1, v4}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_1b

    :goto_13
    return-object v5

    .line 79
    :cond_1b
    :goto_14
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    :cond_1c
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

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
    const/4 v1, 0x0

    .line 13
    move v2, v0

    .line 14
    move-object v3, v1

    .line 15
    :goto_0
    const/4 v4, 0x3

    .line 16
    if-ge v0, v4, :cond_3

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0}, Lcom/friday/document/repair/CommandImageRepairer;->e()Lje/v;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    new-instance v5, Lje/w$a;

    .line 23
    .line 24
    invoke-direct {v5}, Lje/w$a;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, p1}, Lje/w$a;->p(Ljava/lang/String;)Lje/w$a;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5}, Lje/w$a;->b()Lje/w;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v4, v5}, Lje/v;->b(Lje/w;)Lje/e;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v4}, Lje/e;->execute()Lje/y;

    .line 40
    .line 41
    .line 42
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :try_start_1
    invoke-virtual {v4}, Lje/y;->s()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, Lje/y;->e()Lje/z;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-eqz v5, :cond_0

    .line 54
    .line 55
    invoke-virtual {v5}, Lje/z;->byteStream()Ljava/io/InputStream;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-static {p2, v5}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromIS(Ljava/lang/String;Ljava/io/InputStream;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    const/4 v2, 0x1

    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v3

    .line 68
    goto :goto_2

    .line 69
    :cond_0
    new-instance v3, Ljava/lang/Exception;

    .line 70
    .line 71
    const-string v5, "Response body\u4e3a\u7a7a"

    .line 72
    .line 73
    invoke-direct {v3, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v3

    .line 77
    :cond_1
    new-instance v3, Ljava/lang/Exception;

    .line 78
    .line 79
    invoke-virtual {v4}, Lje/y;->j()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    new-instance v6, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v7, "HTTP Code: "

    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-direct {v3, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_2
    :goto_1
    sget-object v5, Lqc/q;->a:Lqc/q;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    .line 105
    :try_start_2
    invoke-static {v4, v1}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :catch_0
    move-exception v3

    .line 110
    goto :goto_3

    .line 111
    :goto_2
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 112
    :catchall_1
    move-exception v5

    .line 113
    :try_start_4
    invoke-static {v4, v3}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    throw v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 117
    :goto_3
    if-nez v2, :cond_3

    .line 118
    .line 119
    const-wide/16 v4, 0x3e8

    .line 120
    .line 121
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 122
    .line 123
    .line 124
    add-int/lit8 v0, v0, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    if-nez v2, :cond_5

    .line 128
    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_4
    new-instance v3, Ljava/lang/Exception;

    .line 133
    .line 134
    new-instance p2, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 137
    .line 138
    .line 139
    const-string v0, "\u4e0b\u8f7d\u5931\u8d25: "

    .line 140
    .line 141
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-direct {v3, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :goto_4
    throw v3

    .line 155
    :cond_5
    return-void
.end method
