.class public final Lcom/friday/common/helper/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/friday/common/helper/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/common/helper/c;

    invoke-direct {v0}, Lcom/friday/common/helper/c;-><init>()V

    sput-object v0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

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

.method public static synthetic b(Lcom/friday/common/helper/c;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;ZZLjava/util/ArrayList;ILjava/lang/Object;)V
    .locals 9

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-string p3, ""

    .line 8
    .line 9
    :cond_0
    move-object v3, p3

    .line 10
    and-int/lit8 p3, v0, 0x8

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    move v4, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v4, p4

    .line 18
    :goto_0
    and-int/lit8 p3, v0, 0x10

    .line 19
    .line 20
    if-eqz p3, :cond_2

    .line 21
    .line 22
    new-instance p3, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    move-object v5, p3

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move-object v5, p5

    .line 30
    :goto_1
    and-int/lit8 p3, v0, 0x20

    .line 31
    .line 32
    if-eqz p3, :cond_3

    .line 33
    .line 34
    move v6, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_3
    move v6, p6

    .line 37
    :goto_2
    and-int/lit8 p3, v0, 0x40

    .line 38
    .line 39
    if-eqz p3, :cond_4

    .line 40
    .line 41
    move v7, v1

    .line 42
    goto :goto_3

    .line 43
    :cond_4
    move/from16 v7, p7

    .line 44
    .line 45
    :goto_3
    and-int/lit16 p3, v0, 0x80

    .line 46
    .line 47
    if-eqz p3, :cond_5

    .line 48
    .line 49
    new-instance p3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    move-object v8, p3

    .line 55
    :goto_4
    move-object v0, p0

    .line 56
    move-object v1, p1

    .line 57
    move-object v2, p2

    .line 58
    goto :goto_5

    .line 59
    :cond_5
    move-object/from16 v8, p8

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :goto_5
    invoke-virtual/range {v0 .. v8}, Lcom/friday/common/helper/c;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;ZZLjava/util/ArrayList;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static synthetic e(Lcom/friday/common/helper/c;Ljava/lang/String;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/helper/c;->d(Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic h(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p4, Lcom/friday/common/entity/FromPage;->NONE:Lcom/friday/common/entity/FromPage;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/common/helper/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic j(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p4, Lcom/friday/common/entity/FromPage;->NONE:Lcom/friday/common/entity/FromPage;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/common/helper/c;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic l(Lcom/friday/common/helper/c;Ljava/lang/String;ZZZLjava/lang/String;ILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-string p5, ""

    .line 6
    .line 7
    :cond_0
    move-object v0, p0

    .line 8
    move-object v1, p1

    .line 9
    move v2, p2

    .line 10
    move v3, p3

    .line 11
    move v4, p4

    .line 12
    move-object v5, p5

    .line 13
    invoke-virtual/range {v0 .. v5}, Lcom/friday/common/helper/c;->k(Ljava/lang/String;ZZZLjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic q(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)V
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p4, Lcom/friday/common/entity/FromPage;->NONE:Lcom/friday/common/entity/FromPage;

    .line 6
    .line 7
    :cond_0
    move-object v4, p4

    .line 8
    and-int/lit8 p4, p8, 0x10

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    if-eqz p4, :cond_1

    .line 13
    .line 14
    move-object v5, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v5, p5

    .line 17
    :goto_0
    and-int/lit8 p4, p8, 0x20

    .line 18
    .line 19
    if-eqz p4, :cond_2

    .line 20
    .line 21
    sget-object p4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 22
    .line 23
    invoke-virtual {p4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-virtual {p4}, Lcom/friday/common/helper/b;->v()Z

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    xor-int/lit8 p6, p4, 0x1

    .line 32
    .line 33
    :cond_2
    move v6, p6

    .line 34
    and-int/lit8 p4, p8, 0x40

    .line 35
    .line 36
    if-eqz p4, :cond_3

    .line 37
    .line 38
    move-object v7, v0

    .line 39
    move-object v1, p1

    .line 40
    move-object v2, p2

    .line 41
    move-object v3, p3

    .line 42
    move-object v0, p0

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    move-object v7, p7

    .line 45
    move-object v0, p0

    .line 46
    move-object v1, p1

    .line 47
    move-object v2, p2

    .line 48
    move-object v3, p3

    .line 49
    :goto_1
    invoke-virtual/range {v0 .. v7}, Lcom/friday/common/helper/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static synthetic s(Lcom/friday/common/helper/c;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;JILjava/lang/Object;)V
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x4

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    move v3, p3

    .line 7
    and-int/lit8 p3, p7, 0x8

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    const-string p4, ""

    .line 12
    .line 13
    :cond_1
    move-object v4, p4

    .line 14
    and-int/lit8 p3, p7, 0x10

    .line 15
    .line 16
    if-eqz p3, :cond_2

    .line 17
    .line 18
    const-wide/16 p5, 0x0

    .line 19
    .line 20
    :cond_2
    move-object v0, p0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, p2

    .line 23
    move-wide v5, p5

    .line 24
    invoke-virtual/range {v0 .. v6}, Lcom/friday/common/helper/c;->r(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/util/ArrayList;ZZLjava/util/ArrayList;)V
    .locals 6

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parentId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "fileId"

    .line 12
    .line 13
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "resourceList"

    .line 17
    .line 18
    invoke-static {p5, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v3, "fileIdList"

    .line 22
    .line 23
    invoke-static {p8, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    const-string v5, "/main/FolderMoveActivity"

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4, v0, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2, v1, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p2, v3, p8}, Lcom/alibaba/android/arouter/facade/Postcard;->withStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const-string p3, "isNoteCopy"

    .line 49
    .line 50
    invoke-virtual {p2, p3, p4}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-string p3, "isNewNote"

    .line 55
    .line 56
    invoke-virtual {p2, p3, p6}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2, v2, p5}, Lcom/alibaba/android/arouter/facade/Postcard;->withParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const-string p3, "restoreFile"

    .line 65
    .line 66
    invoke-virtual {p2, p3, p7}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation(Landroid/content/Context;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "/main/HomeActivity"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    const-string v0, "imageUrl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "/document/IMAGE_PREVIEW_ACTIVITY"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v0, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "isStudentShare"

    .line 21
    .line 22
    invoke-virtual {p1, v0, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "/login/LoginActivity"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V
    .locals 6

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "parentId"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v2, "fileName"

    .line 12
    .line 13
    invoke-static {p3, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v3, "fromPage"

    .line 17
    .line 18
    invoke-static {p4, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v5, "/paint/NewNoteActivity"

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4, v0, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, v1, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1, v2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, v3, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;)V
    .locals 6

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "parentId"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v2, "fileName"

    .line 12
    .line 13
    invoke-static {p3, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v3, "fromPage"

    .line 17
    .line 18
    invoke-static {p4, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v5, "/paint/NoteActivity"

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4, v0, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, v1, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1, v2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, v3, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final k(Ljava/lang/String;ZZZLjava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "shareTime"

    .line 7
    .line 8
    invoke-static {p5, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "/main/NotePreviewActivity"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2, v0, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "isSearchPage"

    .line 26
    .line 27
    invoke-virtual {p1, v0, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string p2, "canEdit"

    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, v1, p5}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string p2, "isVersion6"

    .line 42
    .line 43
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "filePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "/document/PdfViewerActivity"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v0, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "/main/SearchActivity"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "/document/ShareSearchActivity"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/friday/common/entity/FromPage;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "fileName"

    .line 7
    .line 8
    invoke-static {p3, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v2, "fromPage"

    .line 12
    .line 13
    invoke-static {p4, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v3, "shareTime"

    .line 17
    .line 18
    invoke-static {p5, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v4, "txtFilePath"

    .line 22
    .line 23
    invoke-static {p7, v4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const-string v6, "/document/TxtEditActivity"

    .line 31
    .line 32
    invoke-virtual {v5, v6}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-string v6, "noteId"

    .line 37
    .line 38
    invoke-virtual {v5, v6, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, v0, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, v1, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string p2, "txt"

    .line 51
    .line 52
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, v3, p5}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p2, "canEdit"

    .line 61
    .line 62
    invoke-virtual {p1, p2, p6}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p1, v2, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1, v4, p7}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final r(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V
    .locals 5

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "url"

    .line 7
    .line 8
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v2, "fileId"

    .line 12
    .line 13
    invoke-static {p4, v2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v4, "/document/VideoPlayerActivity"

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3, v0, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, v1, p2}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, v2, p4}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string p2, "seekOnStart"

    .line 39
    .line 40
    invoke-virtual {p1, p2, p5, p6}, Lcom/alibaba/android/arouter/facade/Postcard;->withLong(Ljava/lang/String;J)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "isStudentShare"

    .line 45
    .line 46
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final t(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "localUrl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "/document/MICRO_CLASS_ACTIVITY"

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v0, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final u()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "/document/TeacherOnlyActivity"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/alibaba/android/arouter/launcher/ARouter;->build(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/alibaba/android/arouter/facade/Postcard;->navigation()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method
