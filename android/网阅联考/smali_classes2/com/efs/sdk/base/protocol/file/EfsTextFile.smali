.class public Lcom/efs/sdk/base/protocol/file/EfsTextFile;
.super Lcom/efs/sdk/base/protocol/file/AbsFileLog;
.source "SourceFile"


# static fields
.field private static final FILE_START:Ljava/lang/String; = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***"

.field private static final SECTION_START:Ljava/lang/String; = "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---"


# instance fields
.field private mHasInitLinkInfo:Z

.field private mLinkID:Ljava/lang/String;

.field private mLinkKey:Ljava/lang/String;

.field private sectionList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/efs/sdk/base/protocol/file/section/AbsSection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/efs/sdk/base/protocol/file/AbsFileLog;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->sectionList:Ljava/util/List;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkKey:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkID:Ljava/lang/String;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mHasInitLinkInfo:Z

    .line 18
    .line 19
    return-void
.end method

.method private changeToStr()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "\n"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->sectionList:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lcom/efs/sdk/base/protocol/file/section/AbsSection;

    .line 31
    .line 32
    if-lez v2, :cond_0

    .line 33
    .line 34
    const-string v4, "--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n"

    .line 35
    .line 36
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v3}, Lcom/efs/sdk/base/protocol/file/section/AbsSection;->changeToStr()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method private initLinkInfo()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkID:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkKey:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-boolean v0, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mHasInitLinkInfo:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    iget-object v0, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->sectionList:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lcom/efs/sdk/base/protocol/file/section/AbsSection;

    .line 40
    .line 41
    instance-of v2, v1, Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    check-cast v1, Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->getDataMap()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v2, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkID:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    const-string v2, "w_frmid"

    .line 60
    .line 61
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iput-object v2, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkID:Ljava/lang/String;

    .line 76
    .line 77
    :cond_3
    iget-object v2, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkKey:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    const-string v2, "w_linkKey"

    .line 86
    .line 87
    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    iput-object v1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkKey:Ljava/lang/String;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    const/4 v0, 0x1

    .line 105
    iput-boolean v0, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mHasInitLinkInfo:Z

    .line 106
    .line 107
    return-void
.end method

.method private insertCustomInfoSection()V
    .locals 4

    .line 1
    new-instance v0, Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 2
    .line 3
    const-string v1, "custom_info"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/efs/sdk/base/protocol/file/section/KVSection;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lcom/efs/sdk/base/a/c/a;->a()Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/util/Map$Entry;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0, v3, v2}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->sectionList:Ljava/util/List;

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-interface {v1, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public createAndAddJSONSection(Ljava/lang/String;)Lcom/efs/sdk/base/protocol/file/section/JSONSection;
    .locals 1

    .line 1
    new-instance v0, Lcom/efs/sdk/base/protocol/file/section/JSONSection;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/efs/sdk/base/protocol/file/section/JSONSection;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->sectionList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public createAndAddKVSection(Ljava/lang/String;)Lcom/efs/sdk/base/protocol/file/section/KVSection;
    .locals 1

    .line 1
    new-instance v0, Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/efs/sdk/base/protocol/file/section/KVSection;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->sectionList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public createAndAddTextSection(Ljava/lang/String;)Lcom/efs/sdk/base/protocol/file/section/TextSection;
    .locals 1

    .line 1
    new-instance v0, Lcom/efs/sdk/base/protocol/file/section/TextSection;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/efs/sdk/base/protocol/file/section/TextSection;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->sectionList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public generate()[B
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->changeToStr()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v1, v1, Lcom/efs/sdk/base/a/c/a;->g:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string v1, "efs.base"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public generateString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->changeToStr()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getLinkId()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->initLinkInfo()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkID:Ljava/lang/String;

    .line 5
    .line 6
    return-object v0
.end method

.method public getLinkKey()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->initLinkInfo()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->mLinkKey:Ljava/lang/String;

    .line 5
    .line 6
    return-object v0
.end method

.method public insertGlobal(Lcom/efs/sdk/base/a/c/b;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->insertCustomInfoSection()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/efs/sdk/base/protocol/file/EfsTextFile;->sectionList:Ljava/util/List;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/efs/sdk/base/protocol/AbsLog;->getLogType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v3, Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 16
    .line 17
    const-string v4, "global_head"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v4, "type"

    .line 23
    .line 24
    invoke-virtual {v3, v4, v1}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 29
    .line 30
    const-string v5, "appid"

    .line 31
    .line 32
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 41
    .line 42
    const-string v5, "wid"

    .line 43
    .line 44
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 53
    .line 54
    const-string v5, "pid"

    .line 55
    .line 56
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 65
    .line 66
    const-string v5, "pkg"

    .line 67
    .line 68
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 77
    .line 78
    const-string v5, "ver"

    .line 79
    .line 80
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 89
    .line 90
    const-string v5, "vcode"

    .line 91
    .line 92
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 101
    .line 102
    const-string v5, "ps"

    .line 103
    .line 104
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 113
    .line 114
    const-string v5, "stime"

    .line 115
    .line 116
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {}, Lcom/efs/sdk/base/a/a/a;->a()Lcom/efs/sdk/base/a/a/a;

    .line 125
    .line 126
    .line 127
    invoke-static {}, Lcom/efs/sdk/base/a/a/a;->b()J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    const-wide/16 v6, 0x3e8

    .line 132
    .line 133
    div-long/2addr v4, v6

    .line 134
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    const-string v5, "ctime"

    .line 139
    .line 140
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {}, Lcom/efs/sdk/base/a/a/a;->a()Lcom/efs/sdk/base/a/a/a;

    .line 145
    .line 146
    .line 147
    invoke-static {}, Lcom/efs/sdk/base/a/a/a;->b()J

    .line 148
    .line 149
    .line 150
    move-result-wide v4

    .line 151
    div-long/2addr v4, v6

    .line 152
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    const-string v5, "w_tm"

    .line 157
    .line 158
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 163
    .line 164
    const-string v5, "sdk_ver"

    .line 165
    .line 166
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-virtual {v1, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 171
    .line 172
    .line 173
    const-string v1, ""

    .line 174
    .line 175
    const-string v4, "uid"

    .line 176
    .line 177
    invoke-virtual {p1, v4, v1}, Lcom/efs/sdk/base/a/c/b;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-nez v5, :cond_0

    .line 190
    .line 191
    invoke-virtual {v3, v4, v1}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 192
    .line 193
    .line 194
    :cond_0
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    new-instance v1, Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 198
    .line 199
    const-string v3, "device_info"

    .line 200
    .line 201
    invoke-direct {v1, v3}, Lcom/efs/sdk/base/protocol/file/section/KVSection;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget-object v3, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 205
    .line 206
    const-string v4, "lang"

    .line 207
    .line 208
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v1, v4, v3}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 217
    .line 218
    const-string v5, "brand"

    .line 219
    .line 220
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-virtual {v3, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 229
    .line 230
    const-string v5, "model"

    .line 231
    .line 232
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-virtual {v3, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 241
    .line 242
    const-string v5, "rom"

    .line 243
    .line 244
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    invoke-virtual {v3, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 253
    .line 254
    const-string v5, "sdk"

    .line 255
    .line 256
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v3, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 265
    .line 266
    const-string v5, "dsp_h"

    .line 267
    .line 268
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual {v3, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 277
    .line 278
    const-string v5, "dsp_w"

    .line 279
    .line 280
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-virtual {v3, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 289
    .line 290
    const-string v5, "tzone"

    .line 291
    .line 292
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {v3, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    iget-object v4, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 301
    .line 302
    const-string v5, "net"

    .line 303
    .line 304
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-virtual {v3, v5, v4}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    iget-object p1, p1, Lcom/efs/sdk/base/a/c/b;->a:Ljava/util/Map;

    .line 313
    .line 314
    const-string v4, "fr"

    .line 315
    .line 316
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-virtual {v3, v4, p1}, Lcom/efs/sdk/base/protocol/file/section/KVSection;->put(Ljava/lang/String;Ljava/lang/Object;)Lcom/efs/sdk/base/protocol/file/section/KVSection;

    .line 321
    .line 322
    .line 323
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    const/4 p1, 0x0

    .line 327
    invoke-interface {v0, p1, v2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 328
    .line 329
    .line 330
    return-void
.end method
