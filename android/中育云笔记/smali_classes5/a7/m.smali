.class public abstract La7/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lcom/luck/picture/lib/entity/LocalMediaFolder;Lcom/luck/picture/lib/entity/LocalMediaFolder;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->c()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMediaFolder;->j()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-static {p1, p0}, Ljava/lang/Integer;->compare(II)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static synthetic b(Lcom/luck/picture/lib/entity/LocalMedia;Lcom/luck/picture/lib/entity/LocalMedia;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/luck/picture/lib/entity/LocalMedia;->o()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1}, Lcom/luck/picture/lib/entity/LocalMedia;->o()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static c(Ljava/util/List;)V
    .locals 1

    .line 1
    new-instance v0, La7/l;

    .line 2
    .line 3
    invoke-direct {v0}, La7/l;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static d(Ljava/util/List;)V
    .locals 1

    .line 1
    new-instance v0, La7/k;

    .line 2
    .line 3
    invoke-direct {v0}, La7/k;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
