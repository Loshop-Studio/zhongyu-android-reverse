# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/friday/document/sync/SyncStateOne;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls2/a;

.field public final b:Ld2/i;

.field public final c:Lcom/friday/common/dao/FileDao;

.field public final d:Lcom/friday/common/dao/ResourceDao;

.field public final e:Lc2/v0;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls2/a;Ld2/i;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/v0;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ezyService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "fileDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "resourceDao"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "imageSafetyDao"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne;->a:Ls2/a;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/friday/document/sync/SyncStateOne;->b:Ld2/i;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/friday/document/sync/SyncStateOne;->c:Lcom/friday/common/dao/FileDao;

    .line 34
    .line 35
    iput-object p4, p0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/friday/document/sync/SyncStateOne;->e:Lc2/v0;

    .line 38
    .line 39
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 48
    .line 49
    new-instance p3, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, "placeholder.jpg"

    .line 61
    .line 62
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iput-object p2, p0, Lcom/friday/document/sync/SyncStateOne;->f:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-nez p3, :cond_0

    .line 76
    .line 77
    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ResourceUtils;->copyFileFromAssets(Ljava/lang/String;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    :cond_0
    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string p2, "getFileMD5ToString(...)"

    .line 85
    .line 86
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lcom/friday/document/sync/SyncStateOne;->g:Ljava/lang/String;

    .line 90
    .line 91
    return-void
.end method

.method public static final C(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final D(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic a(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/sync/SyncStateOne;->D(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/sync/SyncStateOne;->C(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/sync/SyncStateOne;->m(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne;->n(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic e(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/sync/SyncStateOne;->w(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/document/sync/SyncStateOne;->y(Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/helper/OssUploadHelper;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/friday/document/sync/SyncStateOne;->z(Lcom/friday/common/helper/OssUploadHelper;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne;->A(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/document/sync/SyncStateOne;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/sync/SyncStateOne;->B(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/sync/SyncStateOne;->E(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/document/sync/SyncStateOne;Lcom/friday/common/entity/FileEntity;Ljava/io/File;ILjava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcom/friday/document/sync/SyncStateOne;->F(Lcom/friday/common/entity/FileEntity;Ljava/io/File;ILjava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
# RE I/O 写入 JSON（Gson.toJson）。
.method public final A(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 34

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;

    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;

    invoke-direct {v2, v1, v0}, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->y:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v10

    .line 1
    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    const-string v11, "getAbsolutePath(...)"

    const-string v12, "toJson(...)"

    const-string v14, "\uff0c\u6587\u4ef6\u540d="

    const-string v3, "/"

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->o:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v4, Lcom/friday/common/helper/OssUploadHelper;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/OssTokenResponse;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/OssReqData;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/FileEntity;

    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v9, v3

    goto/16 :goto_35

    :pswitch_1
    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    iget v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->s:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->r:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->q:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->p:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    check-cast v14, Ljava/util/ArrayList;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    move-object/from16 v17, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/helper/OssUploadHelper;

    move-object/from16 p1, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/OssTokenResponse;

    move-object/from16 v18, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/OssReqData;

    move-object/from16 v19, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/FileEntity;

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v1, v14

    move-object v14, v5

    move-object v5, v1

    move-object/from16 v17, v6

    move-object v6, v7

    move-object v1, v13

    move-object v7, v15

    move-object/from16 v16, v18

    move-object/from16 v13, v20

    move v15, v2

    move-object/from16 v18, v9

    move-object/from16 v2, p1

    move-object v9, v3

    move-object v3, v8

    move-object v8, v11

    move v11, v4

    goto/16 :goto_33

    :pswitch_2
    move-object/from16 v17, v0

    iget v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/helper/OssUploadHelper;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v8, Lcom/friday/common/entity/OssTokenResponse;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v9, Lcom/friday/common/entity/OssReqData;

    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v14, Lcom/friday/common/entity/FileEntity;

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v30, v3

    move-object/from16 v16, v8

    move-object v8, v11

    goto/16 :goto_31

    :pswitch_3
    move-object/from16 v17, v0

    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    iget v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->r:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/MonitorRequest;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->q:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->p:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->o:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/ResourceEntity;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/Iterator;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Ljava/util/List;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, Lcom/friday/common/helper/OssUploadHelper;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Lcom/friday/common/entity/OssTokenResponse;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    move-object/from16 v19, v0

    check-cast v19, Lcom/friday/common/entity/OssReqData;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    move-object/from16 v20, v0

    check-cast v20, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, Lcom/friday/common/entity/FileEntity;

    :try_start_0
    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v30, v3

    move-object/from16 v25, v12

    move-object/from16 v23, v14

    move-object/from16 v0, v17

    move-object/from16 v27, v18

    move-object/from16 v24, v19

    const/16 v18, 0x1

    goto/16 :goto_29

    :catchall_0
    move-exception v0

    move-object/from16 v30, v3

    move-object/from16 v25, v12

    move-object/from16 v23, v14

    move-object/from16 v27, v18

    move-object/from16 v24, v19

    const/16 v18, 0x1

    goto/16 :goto_2a

    :pswitch_4
    move-object/from16 v17, v0

    iget v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->u:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->t:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->s:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->r:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->q:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->p:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->o:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    move/from16 v20, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/ResourceEntity;

    move-object/from16 v21, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v22, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$IntRef;

    move-object/from16 v23, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v24, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v25, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/helper/OssUploadHelper;

    move-object/from16 v26, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/OssTokenResponse;

    move-object/from16 v27, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/OssReqData;

    move-object/from16 v28, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v29, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/FileEntity;

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v18, v5

    move v5, v2

    move/from16 v2, v20

    move-object/from16 v20, v15

    move-object/from16 v15, v18

    move-object/from16 v30, v3

    move-object/from16 v31, v11

    move-object/from16 v3, v25

    const/16 v18, 0x1

    move-object v11, v0

    move-object/from16 v25, v12

    move-object/from16 v0, v17

    move-object/from16 v17, p1

    move-object v12, v9

    move-object/from16 v9, v24

    move-object/from16 v24, v28

    move-object/from16 v28, v13

    move-object v13, v8

    move-object/from16 v8, v23

    move-object/from16 v23, v14

    move-object v14, v6

    move-object/from16 v6, v22

    goto/16 :goto_26

    :pswitch_5
    move-object/from16 v17, v0

    iget v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v15, Lcom/friday/common/helper/OssUploadHelper;

    move/from16 v20, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/OssTokenResponse;

    move-object/from16 p1, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/OssReqData;

    move-object/from16 v21, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/FileEntity;

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v30, v3

    move-object/from16 v25, v12

    move-object/from16 v23, v14

    move/from16 v14, v20

    move-object/from16 v24, v22

    const/16 v18, 0x1

    move v3, v2

    move-object v2, v11

    move-object v11, v0

    move-object v0, v6

    move-object/from16 v6, p1

    :goto_2
    move-object v12, v13

    move-object v13, v4

    move-object v4, v9

    move-object v9, v7

    move-object/from16 v7, v21

    goto/16 :goto_24

    :pswitch_6
    move-object/from16 v17, v0

    iget v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v15, Lcom/friday/common/helper/OssUploadHelper;

    move/from16 v20, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/OssTokenResponse;

    move-object/from16 p1, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/OssReqData;

    move-object/from16 v21, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/FileEntity;

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v30, v3

    move-object/from16 v25, v12

    move-object/from16 v23, v14

    move-object/from16 v24, v22

    const/4 v12, 0x6

    const/16 v18, 0x1

    move v3, v2

    move/from16 v2, v20

    move-object/from16 v20, p1

    goto/16 :goto_23

    :pswitch_7
    move-object/from16 v17, v0

    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    iget v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/Iterator;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ljava/util/List;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, Lcom/friday/common/helper/OssUploadHelper;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    move-object/from16 v20, v0

    check-cast v20, Lcom/friday/common/entity/OssTokenResponse;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, Lcom/friday/common/entity/OssReqData;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    move-object/from16 v22, v0

    check-cast v22, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    move-object/from16 v23, v0

    check-cast v23, Lcom/friday/common/entity/FileEntity;

    :try_start_1
    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v0, v17

    move-object/from16 v16, v23

    const/16 v18, 0x1

    move-object/from16 v23, v14

    move-object v14, v3

    move-object/from16 v3, v22

    goto/16 :goto_1d

    :catchall_1
    move-exception v0

    move-object/from16 v16, v23

    const/16 v18, 0x1

    move-object/from16 v23, v14

    move-object v14, v3

    move-object/from16 v3, v22

    goto/16 :goto_1f

    :pswitch_8
    move-object/from16 v17, v0

    iget v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v11, Lcom/friday/common/helper/OssUploadHelper;

    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v13, Lcom/friday/common/entity/OssTokenResponse;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v15, Lcom/friday/common/entity/OssReqData;

    move/from16 v20, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/FileEntity;

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v6

    move-object v6, v4

    move-object/from16 v4, v16

    move-object/from16 v30, v3

    move-object/from16 v16, v15

    const/16 v18, 0x1

    move-object v15, v0

    move v3, v2

    move-object v2, v9

    move-object/from16 v0, v17

    move-object/from16 v9, p1

    move-object/from16 p1, v8

    move-object v8, v7

    move/from16 v7, v20

    goto/16 :goto_1b

    :pswitch_9
    move-object/from16 v17, v0

    iget v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v4, Lcom/friday/common/helper/OssUploadHelper;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/OssTokenResponse;

    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/entity/OssReqData;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v9, Lcom/friday/common/entity/FileEntity;

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v13, v2

    move-object/from16 v30, v3

    const/4 v15, 0x0

    const/16 v18, 0x1

    move v2, v0

    move-object/from16 v0, v17

    goto/16 :goto_17

    :pswitch_a
    move-object/from16 v17, v0

    iget v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    check-cast v4, Lcom/friday/common/helper/OssUploadHelper;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/OssTokenResponse;

    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/entity/OssReqData;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    check-cast v9, Lcom/friday/common/entity/FileEntity;

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v13, v2

    move-object/from16 v30, v3

    move-object/from16 v16, v5

    move-object/from16 v20, v6

    move-object v3, v9

    move-object/from16 v21, v11

    const/4 v15, 0x0

    const/16 v18, 0x1

    move v2, v0

    move-object v11, v4

    move-object/from16 v0, v17

    move-object/from16 v17, v8

    goto/16 :goto_16

    :pswitch_b
    move-object/from16 v17, v0

    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/friday/common/entity/OssReqData;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lcom/friday/common/entity/FileEntity;

    :try_start_2
    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object v8, v6

    move-object/from16 v0, v17

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x1

    goto/16 :goto_6

    :catchall_2
    move-exception v0

    move-object v8, v6

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x1

    goto/16 :goto_c

    :pswitch_c
    move-object/from16 v17, v0

    invoke-static/range {v17 .. v17}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    move-result-object v0

    const-string v2, "http"

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v0, v2, v5, v4, v6}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v2, 0x1

    goto :goto_3

    :cond_1
    const/4 v6, 0x0

    :cond_2
    const/4 v2, 0x0

    .line 3
    :goto_3
    const-string v0, "0"

    if-eqz v2, :cond_3

    :goto_4
    move-object/from16 v24, v0

    goto :goto_5

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    move-result-object v20

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v21

    const/16 v24, 0x6

    const/16 v25, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v4, v5}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v24, v4

    .line 4
    :goto_5
    sget-object v20, Lcom/friday/common/helper/OssUploadHelper;->b:Lcom/friday/common/helper/OssUploadHelper$a;

    .line 5
    sget-object v21, Lcom/friday/common/entity/OssFileType$Folder;->INSTANCE:Lcom/friday/common/entity/OssFileType$Folder;

    .line 6
    sget-object v23, Lcom/friday/common/entity/OssFileResource$Resource;->INSTANCE:Lcom/friday/common/entity/OssFileResource$Resource;

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v25

    const/16 v28, 0x22

    const/16 v29, 0x0

    const/16 v22, 0x0

    const-wide/16 v26, 0x0

    .line 8
    invoke-static/range {v20 .. v29}, Lcom/friday/common/helper/OssUploadHelper$a;->b(Lcom/friday/common/helper/OssUploadHelper$a;Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/friday/common/entity/OssReqData;

    move-result-object v4

    .line 9
    :try_start_3
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 10
    iget-object v0, v1, Lcom/friday/document/sync/SyncStateOne;->b:Ld2/i;

    invoke-virtual {v4}, Lcom/friday/common/entity/OssReqData;->getTokenReq()Lcom/friday/common/entity/OssTokenReq;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    move-object/from16 v8, p1

    :try_start_4
    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    iput v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    const/4 v9, 0x0

    :try_start_5
    iput v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    const/4 v13, 0x1

    :try_start_6
    iput v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-interface {v0, v5, v7}, Ld2/i;->a(Lcom/friday/common/entity/OssTokenReq;Lvc/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    if-ne v0, v10, :cond_5

    goto/16 :goto_34

    :cond_5
    move-object/from16 v5, v24

    .line 11
    :goto_6
    :try_start_7
    check-cast v0, Lcom/friday/common/entity/OssTokenResult;

    .line 12
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getSuccess()Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getResult()Lcom/friday/common/entity/OssTokenResponse;

    move-result-object v0

    goto :goto_7

    :catchall_3
    move-exception v0

    goto :goto_c

    :cond_6
    move-object v0, v6

    .line 13
    :goto_7
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :goto_8
    move-object v15, v4

    move-object/from16 v16, v5

    move-object v4, v8

    goto :goto_d

    :catchall_4
    move-exception v0

    :goto_9
    move-object/from16 v5, v24

    goto :goto_c

    :catchall_5
    move-exception v0

    :goto_a
    const/4 v13, 0x1

    goto :goto_9

    :catchall_6
    move-exception v0

    :goto_b
    const/4 v9, 0x0

    goto :goto_a

    :catchall_7
    move-exception v0

    move-object/from16 v8, p1

    goto :goto_b

    :goto_c
    sget-object v15, Lkotlin/Result;->d:Lkotlin/Result$a;

    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_8

    .line 14
    :goto_d
    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_f

    .line 15
    instance-of v8, v5, Ljava/util/concurrent/CancellationException;

    if-nez v8, :cond_e

    instance-of v8, v5, Lcom/friday/common/network/SessionNotReadyException;

    if-nez v8, :cond_e

    .line 16
    instance-of v8, v5, Lretrofit2/HttpException;

    if-eqz v8, :cond_7

    move-object v8, v5

    check-cast v8, Lretrofit2/HttpException;

    goto :goto_e

    :cond_7
    move-object v8, v6

    :goto_e
    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lretrofit2/HttpException;->c()Ldf/c0;

    move-result-object v8

    goto :goto_f

    :cond_8
    move-object v8, v6

    :goto_f
    if-eqz v8, :cond_9

    .line 17
    invoke-virtual {v8}, Ldf/c0;->g()Lje/y;

    move-result-object v17

    if-eqz v17, :cond_9

    invoke-virtual/range {v17 .. v17}, Lje/y;->z()Lje/w;

    move-result-object v17

    goto :goto_10

    :cond_9
    move-object/from16 v17, v6

    :goto_10
    if-eqz v17, :cond_a

    .line 18
    invoke-virtual/range {v17 .. v17}, Lje/w;->g()Ljava/lang/String;

    move-result-object v18

    move-object/from16 v6, v18

    :cond_a
    if-eqz v17, :cond_b

    invoke-virtual/range {v17 .. v17}, Lje/w;->j()Lje/r;

    move-result-object v20

    if-eqz v20, :cond_b

    invoke-virtual/range {v20 .. v20}, Lje/r;->i()Ljava/lang/String;

    move-result-object v20

    move-object/from16 v9, v20

    goto :goto_11

    :cond_b
    const/4 v9, 0x0

    :goto_11
    if-eqz v17, :cond_c

    invoke-virtual/range {v17 .. v17}, Lje/w;->j()Lje/r;

    move-result-object v17

    if-eqz v17, :cond_c

    invoke-virtual/range {v17 .. v17}, Lje/r;->d()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v13, v17

    goto :goto_12

    :cond_c
    const/4 v13, 0x0

    :goto_12
    if-eqz v8, :cond_d

    invoke-virtual {v8}, Ldf/c0;->b()I

    move-result v8

    invoke-static {v8}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_13

    :cond_d
    const/4 v8, 0x0

    :goto_13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v5

    move-object/from16 p1, v0

    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v20, v15

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v11

    const-string v11, "\u83b7\u53d6\u4e0a\u4f20\u51ed\u8bc1\u5f02\u5e38\uff0cmethod="

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\uff0chost="

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\uff0cpath="

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\uff0cHTTP="

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "\uff0ctype="

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\uff0c\u6587\u4ef6id="

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    goto :goto_14

    .line 19
    :cond_e
    throw v5

    :cond_f
    move-object/from16 p1, v0

    move-object/from16 v21, v11

    move-object/from16 v20, v15

    .line 20
    :goto_14
    invoke-static/range {p1 .. p1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    goto :goto_15

    :cond_10
    move-object/from16 v0, p1

    :goto_15
    check-cast v0, Lcom/friday/common/entity/OssTokenResponse;

    if-eqz v0, :cond_2e

    .line 21
    new-instance v11, Lcom/friday/common/helper/OssUploadHelper;

    invoke-direct {v11, v0}, Lcom/friday/common/helper/OssUploadHelper;-><init>(Lcom/friday/common/entity/OssTokenResponse;)V

    .line 22
    invoke-virtual/range {v20 .. v20}, Lcom/friday/common/entity/OssReqData;->getObjectKey()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    move-object v5, v3

    .line 23
    iget-object v3, v1, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    invoke-virtual {v4}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v6

    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    iput v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    const/4 v8, 0x2

    iput v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    move-object v8, v4

    move-object v9, v5

    move-object v4, v6

    const-wide/16 v5, 0x0

    move-object v15, v8

    const/4 v8, 0x2

    move-object/from16 v22, v9

    const/4 v9, 0x0

    move-object/from16 v17, v15

    move-object/from16 v30, v22

    const/4 v15, 0x0

    const/16 v18, 0x1

    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->Q(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_11

    goto/16 :goto_34

    :cond_11
    move-object/from16 v33, v16

    move-object/from16 v16, v0

    move-object v0, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v33

    :goto_16
    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_29

    .line 24
    iget-object v0, v1, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v4

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    iput v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    const/4 v5, 0x3

    iput v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    const-wide/16 v5, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object/from16 v33, v3

    move-object v3, v0

    move-object/from16 v0, v33

    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_12

    goto/16 :goto_34

    :cond_12
    move-object v9, v0

    move-object v0, v3

    move-object v4, v11

    move-object/from16 v5, v16

    move-object/from16 v8, v17

    move-object/from16 v6, v20

    .line 25
    :goto_17
    check-cast v0, Ljava/util/List;

    .line 26
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .line 27
    instance-of v11, v3, Ljava/util/Collection;

    if-eqz v11, :cond_13

    move-object v11, v3

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_13

    const/4 v11, 0x0

    goto :goto_19

    .line 28
    :cond_13
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v11, 0x0

    :cond_14
    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lcom/friday/common/entity/ResourceEntity;

    .line 29
    invoke-virtual/range {v16 .. v16}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    move-result v17

    if-nez v17, :cond_14

    invoke-virtual/range {v16 .. v16}, Lcom/friday/common/entity/ResourceEntity;->getToBeUploaded()Z

    move-result v16

    if-eqz v16, :cond_14

    add-int/lit8 v11, v11, 0x1

    if-gez v11, :cond_14

    .line 30
    invoke-static {}, Lrc/w;->v()V

    goto :goto_18

    .line 31
    :cond_15
    :goto_19
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 32
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v15

    move-object/from16 p1, v0

    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    move-result-object v0

    move/from16 v16, v2

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v2

    move-object/from16 v17, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v20, v4

    const-string v4, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u5f00\u59cb\u4e0a\u4f20\u8d44\u6e90\u6587\u4ef6\uff0c\u6587\u4ef6id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\uff0c\u8d44\u6e90\u603b\u6570="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\uff0c\u5f85\u4e0a\u4f20\u6570="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 33
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v2, p1

    move v15, v11

    move/from16 v3, v16

    move-object/from16 v4, v17

    move-object v11, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object/from16 v5, v20

    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_27

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p1, v2

    move-object/from16 v2, v16

    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 34
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    move-result v16

    if-nez v16, :cond_26

    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getToBeUploaded()Z

    move-result v16

    if-eqz v16, :cond_26

    .line 35
    iput-object v11, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    move-object/from16 v16, v6

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v5, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v13, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    iput-object v4, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    iput-object v0, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->o:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->p:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->q:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->r:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->s:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->t:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->u:Ljava/lang/Object;

    iput v3, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iput v15, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    const/4 v6, 0x4

    iput v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-virtual {v1, v11, v2, v8}, Lcom/friday/document/sync/SyncStateOne;->m(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_16

    goto/16 :goto_34

    :cond_16
    move-object/from16 v33, v5

    move-object v5, v0

    move-object v0, v6

    move-object v6, v2

    move-object v2, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v7

    move v7, v15

    move-object v15, v11

    move-object/from16 v11, v33

    :goto_1b
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_17

    .line 36
    iget v0, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    move-object v0, v5

    move-object v5, v11

    move-object v6, v13

    move-object v11, v15

    move-object v13, v2

    move v15, v7

    move-object/from16 v7, v16

    :goto_1c
    move-object/from16 v2, p1

    goto/16 :goto_1a

    .line 37
    :cond_17
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->getFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v20, v9

    .line 39
    invoke-static/range {v17 .. v17}, Lcom/blankj/utilcode/util/FileUtils;->getFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v17, v13

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v23, v14

    move-object/from16 v14, v30

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 40
    :try_start_8
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 41
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v0

    .line 42
    iput-object v15, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v11, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    iput-object v4, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    iput-object v5, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    iput-object v9, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    iput v3, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iput v7, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    const/4 v13, 0x0

    iput v13, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->x:I

    const/4 v13, 0x5

    iput v13, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-virtual {v11, v0, v9, v8}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    if-ne v0, v10, :cond_18

    goto/16 :goto_34

    :cond_18
    move-object v13, v2

    move v2, v7

    move-object v7, v8

    move-object/from16 v21, v16

    move-object v8, v5

    move-object v5, v9

    move-object/from16 v16, v15

    move-object v9, v4

    move-object v15, v11

    move-object/from16 v11, p1

    move v4, v3

    move-object/from16 v3, v20

    move-object/from16 v20, v17

    .line 43
    :goto_1d
    :try_start_9
    check-cast v0, Ljava/lang/String;

    .line 44
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    :goto_1e
    move-object/from16 p1, v6

    move-object v6, v0

    move-object v0, v8

    move-object v8, v7

    move-object/from16 v7, p1

    move-object/from16 p1, v9

    move-object v9, v3

    move v3, v4

    move-object/from16 v4, p1

    move-object/from16 p1, v11

    move-object/from16 v11, v16

    goto :goto_20

    :catchall_8
    move-exception v0

    goto :goto_1f

    :catchall_9
    move-exception v0

    move-object v13, v2

    move v2, v7

    move-object v7, v8

    move-object/from16 v21, v16

    move-object v8, v5

    move-object v5, v9

    move-object/from16 v16, v15

    move-object v9, v4

    move-object v15, v11

    move-object/from16 v11, p1

    move v4, v3

    move-object/from16 v3, v20

    move-object/from16 v20, v17

    :goto_1f
    sget-object v17, Lkotlin/Result;->d:Lkotlin/Result$a;

    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1e

    .line 45
    :goto_20
    invoke-static {v6}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v16

    move-object/from16 v17, v6

    if-eqz v16, :cond_19

    .line 46
    iget v6, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 47
    invoke-virtual {v11}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v24, v9

    invoke-virtual {v7}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v30, v14

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v25, v12

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v26, v10

    const-string v10, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u5355\u4e2a\u8d44\u6e90\u4e0a\u4f20\u5931\u8d25\uff0c\u5df2\u8df3\u8fc7\u5e76\u7ee7\u7eed\u540e\u7eed\u8d44\u6e90\uff0c\u6587\u4ef6id="

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\uff0c\u8d44\u6e90="

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\uff0cobjectKey="

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\uff0c\u5f02\u5e38="

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    goto :goto_21

    :cond_19
    move-object/from16 v24, v9

    move-object/from16 v26, v10

    move-object/from16 v25, v12

    move-object/from16 v30, v14

    .line 48
    :goto_21
    invoke-static/range {v17 .. v17}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1a

    const/4 v6, 0x0

    goto :goto_22

    :cond_1a
    move-object/from16 v6, v17

    :goto_22
    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_1b

    .line 49
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-nez v9, :cond_1c

    :cond_1b
    move-object/from16 v12, v25

    move-object/from16 v10, v26

    goto/16 :goto_30

    .line 50
    :cond_1c
    iget-object v9, v1, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    invoke-virtual {v7}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v10

    iput-object v11, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v15, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v13, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    iput-object v4, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    iput-object v0, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    iput-object v7, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    iput v3, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iput v2, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    const/4 v12, 0x6

    iput v12, v8, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-interface {v9, v10, v6, v8}, Lcom/friday/common/dao/ResourceDao;->a(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v10, v26

    if-ne v9, v10, :cond_1d

    goto/16 :goto_34

    :cond_1d
    move-object v9, v4

    move-object v4, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v0

    move-object v0, v11

    move-object/from16 v11, p1

    .line 51
    :goto_23
    iget-object v14, v1, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v12

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    move-object/from16 v16, v0

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    iput v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iput v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    const/4 v0, 0x7

    iput v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-interface {v14, v12, v7}, Lcom/friday/common/dao/ResourceDao;->H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_1e

    goto/16 :goto_34

    :cond_1e
    move v14, v2

    move-object v0, v6

    move-object v2, v11

    move-object/from16 v11, v16

    move-object/from16 v6, v20

    goto/16 :goto_2

    .line 52
    :goto_24
    invoke-virtual {v1}, Lcom/friday/document/sync/SyncStateOne;->t()Z

    move-result v16

    if-eqz v16, :cond_25

    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getResourceType()I

    move-result v16

    if-nez v16, :cond_25

    move-object/from16 p1, v0

    iget-object v0, v1, Lcom/friday/document/sync/SyncStateOne;->g:Ljava/lang/String;

    move-object/from16 v16, v2

    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/ResourceEntity;->getMd5()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    .line 53
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->getFileNameNoExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    const-string v2, "screenCapture"

    move-object/from16 v17, v5

    const-string v5, ""

    invoke-static {v0, v2, v5}, Lqd/c0;->Y0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move-object/from16 v21, v5

    move-object/from16 v26, v6

    move-object/from16 v27, v7

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 55
    invoke-static {v0, v2, v6, v5, v7}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    move-object/from16 v5, v20

    goto :goto_25

    :cond_1f
    move-object/from16 v5, v21

    :goto_25
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u4e91\u7b14\u8bb0"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 56
    invoke-virtual {v1, v13}, Lcom/friday/document/sync/SyncStateOne;->x(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_20

    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u56fe\u7247\u8df3\u8fc7\u9001\u5ba1\uff0cpath="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\uff0cossUrl="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    sget-object v0, Lqc/q;->a:Lqc/q;

    move-object v0, v8

    move-object v8, v9

    move-object v13, v12

    move-object v5, v15

    move-object/from16 v2, v16

    move-object/from16 v9, v24

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move v15, v14

    goto/16 :goto_2c

    .line 58
    :cond_20
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    move-result-object v5

    const-string v7, "getAppPackageName(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-static {v13}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    move-object/from16 v21, v0

    .line 60
    new-instance v0, Lcom/friday/common/entity/FlagNote;

    invoke-virtual {v1}, Lcom/friday/document/sync/SyncStateOne;->r()J

    move-result-wide v28

    move-object/from16 v31, v2

    invoke-static/range {v28 .. v29}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/friday/common/entity/FlagNote;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v2, v25

    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    iget-object v2, v1, Lcom/friday/document/sync/SyncStateOne;->e:Lc2/v0;

    move-object/from16 v28, v13

    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v13

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    move-object/from16 v29, v11

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {v27 .. v27}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v26 .. v26}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v15, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v12, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    iput-object v4, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    iput-object v8, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    invoke-static/range {v28 .. v28}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->o:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->p:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->q:Ljava/lang/Object;

    iput-object v6, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->r:Ljava/lang/Object;

    iput-object v5, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->s:Ljava/lang/Object;

    iput-object v7, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->t:Ljava/lang/Object;

    iput-object v0, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->u:Ljava/lang/Object;

    iput v3, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iput v14, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    const/16 v11, 0x8

    iput v11, v9, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-interface {v2, v13, v9}, Lc2/v0;->d(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_21

    goto/16 :goto_34

    :cond_21
    move-object v13, v5

    move-object/from16 v11, v29

    move v5, v3

    move-object v3, v12

    move-object/from16 v29, v24

    move-object/from16 v24, v27

    move-object v12, v6

    move-object v6, v8

    move-object/from16 v27, v26

    move-object v8, v4

    move-object/from16 v26, v15

    move-object/from16 v4, v21

    move-object/from16 v21, p1

    move-object v15, v0

    move-object v0, v2

    move v2, v14

    move-object v14, v7

    move-object v7, v9

    move-object/from16 v9, v16

    :goto_26
    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move/from16 v16, v0

    :goto_27
    move-object/from16 v32, v11

    goto :goto_28

    :cond_22
    const/16 v16, 0x0

    goto :goto_27

    .line 62
    :goto_28
    new-instance v11, Lcom/friday/common/entity/MonitorRequest;

    move-object/from16 p1, v26

    move-object/from16 v26, v9

    move-object/from16 v9, p1

    move-object/from16 p1, v4

    move-object/from16 v4, v32

    invoke-direct/range {v11 .. v16}, Lcom/friday/common/entity/MonitorRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    .line 63
    :try_start_a
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 64
    iget-object v0, v1, Lcom/friday/document/sync/SyncStateOne;->b:Ld2/i;

    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    invoke-static/range {v29 .. v29}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v27 .. v27}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static/range {v26 .. v26}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    invoke-static/range {v28 .. v28}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->o:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->p:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->q:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->r:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->s:Ljava/lang/Object;

    iput-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->t:Ljava/lang/Object;

    iput-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->u:Ljava/lang/Object;

    iput v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iput v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    const/4 v13, 0x0

    iput v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->x:I

    const/16 v12, 0x9

    iput v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-interface {v0, v11, v7}, Ld2/i;->b(Lcom/friday/common/entity/MonitorRequest;Lvc/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_b

    if-ne v0, v10, :cond_23

    goto/16 :goto_34

    :cond_23
    move-object v11, v3

    move-object/from16 v21, v4

    move-object v15, v9

    move-object/from16 v9, v26

    move-object/from16 v20, v29

    :goto_29
    :try_start_b
    check-cast v0, Lcom/zykj/http/bean/ApiResp;

    .line 65
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    goto :goto_2b

    :catchall_a
    move-exception v0

    goto :goto_2a

    :catchall_b
    move-exception v0

    move-object v11, v3

    move-object/from16 v21, v4

    move-object v15, v9

    move-object/from16 v9, v26

    move-object/from16 v20, v29

    :goto_2a
    sget-object v3, Lkotlin/Result;->d:Lkotlin/Result$a;

    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2b
    invoke-static {v0}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    move v3, v5

    move-object v0, v6

    move-object v4, v8

    move-object v13, v11

    move-object v5, v15

    move-object/from16 v11, v21

    move-object/from16 v6, v27

    move v15, v2

    move-object v8, v7

    move-object v2, v9

    move-object/from16 v9, v20

    move-object/from16 v7, v24

    :goto_2c
    move-object/from16 v14, v23

    move-object/from16 v12, v25

    goto/16 :goto_1a

    :cond_24
    :goto_2d
    move-object/from16 v26, v6

    move-object/from16 v27, v7

    move-object/from16 v29, v11

    goto :goto_2e

    :cond_25
    move-object/from16 v16, v2

    goto :goto_2d

    :goto_2e
    move-object v0, v8

    move-object v8, v9

    move-object v13, v12

    move-object v5, v15

    move-object/from16 v2, v16

    move-object/from16 v9, v24

    move-object/from16 v12, v25

    move-object/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v11, v29

    move v15, v14

    :goto_2f
    move-object/from16 v14, v23

    goto/16 :goto_1a

    :goto_30
    move-object v5, v15

    move-object/from16 v6, v20

    move-object/from16 v7, v21

    move-object/from16 v14, v23

    move-object/from16 v9, v24

    move v15, v2

    goto/16 :goto_1c

    :cond_26
    move-object/from16 v16, v6

    move-object/from16 v23, v14

    move-object/from16 v2, p1

    move-object/from16 v6, v16

    goto :goto_2f

    :cond_27
    move-object/from16 v23, v14

    .line 66
    iget v0, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    if-lez v0, :cond_28

    .line 67
    invoke-virtual {v11}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    move-result-object v2

    iget v3, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u672c\u6b21\u5b58\u5728\u8d44\u6e90\u4e0a\u4f20\u5931\u8d25\uff0c\u4f46\u5df2\u7ee7\u7eed\u540c\u6b65\u5176\u4ed6\u6210\u529f\u8d44\u6e90\uff0c\u6587\u4ef6id="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v6, v23

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\uff0c\u5931\u8d25\u6570="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    :cond_28
    sget-object v0, Lqc/q;->a:Lqc/q;

    move-object v4, v5

    move-object v2, v13

    move-object/from16 v9, v30

    goto/16 :goto_35

    :cond_29
    move-object v0, v3

    move-object v6, v14

    .line 68
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u672a\u627e\u5230\u8d44\u6e90\u8868\u8bb0\u5f55\uff0c\u6309\u65e7\u7b14\u8bb0\u7d22\u5f15\u4e0a\u4f20\uff0c\u6587\u4ef6id="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 69
    new-instance v4, Ljava/io/File;

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "index.json"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 71
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v8, v21

    invoke-static {v5, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    iput v2, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    const/16 v6, 0xa

    iput v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-virtual {v11, v5, v3, v7}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v10, :cond_2a

    goto/16 :goto_34

    :cond_2a
    move-object v14, v0

    move v0, v2

    move-object v2, v3

    move-object v6, v11

    move-object v5, v13

    move-object/from16 v13, v17

    move-object/from16 v9, v20

    .line 73
    :goto_31
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 74
    invoke-virtual {v14}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v11}, Lcom/friday/document/sync/SyncStateOne;->q(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v11

    .line 75
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    move-object/from16 v17, v4

    move-object/from16 v18, v11

    move-object/from16 v19, v18

    move v11, v0

    move-object v0, v14

    move-object v14, v2

    move-object v2, v6

    move-object v6, v7

    move-object v7, v5

    move-object v5, v3

    move-object v3, v15

    const/4 v15, 0x0

    :goto_32
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v1, v4

    check-cast v1, Ljava/lang/String;

    move-object/from16 p1, v4

    .line 76
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v20, v1

    .line 77
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v21, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v30

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 78
    invoke-static/range {v21 .. v21}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    move-result-object v23

    .line 79
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    move-object/from16 v24, v0

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v7, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    iput-object v5, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    iput-object v3, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->o:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->p:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->q:Ljava/lang/Object;

    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->r:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->s:Ljava/lang/Object;

    iput v11, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    iput v15, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->w:I

    move-object/from16 p1, v9

    const/4 v9, 0x0

    iput v9, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->x:I

    const/16 v0, 0xb

    iput v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    move-object v9, v1

    move-object v0, v3

    move-object/from16 v3, v23

    move-object/from16 v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/friday/document/sync/SyncStateOne;->z(Lcom/friday/common/helper/OssUploadHelper;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_2b

    goto/16 :goto_34

    :cond_2b
    move-object v3, v0

    move-object/from16 v1, v19

    move-object/from16 v0, v24

    move-object/from16 v19, p1

    :goto_33
    move-object/from16 v30, v9

    move-object/from16 v9, v19

    move-object/from16 v19, v1

    move-object/from16 v1, p0

    goto/16 :goto_32

    :cond_2c
    move-object/from16 v24, v0

    move-object/from16 p1, v9

    move-object/from16 v9, v30

    .line 80
    invoke-virtual/range {v24 .. v24}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "res.json"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 82
    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v3, v5}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x2

    const/4 v15, 0x0

    invoke-static {v1, v3, v15, v4, v15}, Lcd/g;->g(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 83
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 84
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->c:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->d:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->e:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->f:Ljava/lang/Object;

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->g:Ljava/lang/Object;

    iput-object v7, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->i:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->j:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->k:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->l:Ljava/lang/Object;

    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->m:Ljava/lang/Object;

    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->n:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->o:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->p:Ljava/lang/Object;

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->q:Ljava/lang/Object;

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->r:Ljava/lang/Object;

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->s:Ljava/lang/Object;

    iput v11, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->v:I

    const/16 v0, 0xc

    iput v0, v6, Lcom/friday/document/sync/SyncStateOne$uploadFile$1;->A:I

    invoke-virtual {v2, v4, v3, v6}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_2d

    :goto_34
    return-object v10

    :cond_2d
    move-object v4, v2

    move-object v2, v7

    .line 86
    :goto_35
    invoke-virtual {v4}, Lcom/friday/common/helper/OssUploadHelper;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2e
    move-object/from16 v17, v4

    move-object v6, v14

    .line 87
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u83b7\u53d6 ossToken \u5931\u8d25\uff0c\u6587\u4ef6id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 88
    new-instance v0, Lcom/friday/common/util/SyncException;

    .line 89
    sget-object v1, Lcom/friday/common/util/SyncException$Kind;->h:Lcom/friday/common/util/SyncException$Kind;

    .line 90
    const-string v2, "\u83b7\u53d6 ossToken \u5931\u8d25"

    .line 91
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final B(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;

    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;

    invoke-direct {v2, v0, v1}, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->v:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v2

    .line 1
    iget v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    const-string v10, "\uff0c\u91cd\u8bd5\u8d44\u6e90\u6570="

    const-string v11, "\uff0ccode="

    const-string v12, "\uff0c\u8d44\u6e90\u6570="

    const-string v13, "\uff0c\u8d44\u6e90\u793a\u4f8b="

    const-string v14, "\uff0cmsg="

    const-string v6, "\uff0c\u6587\u4ef6\u540d="

    packed-switch v3, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->r:I

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->o:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->m:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->l:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v10, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->k:Ljava/lang/Object;

    check-cast v10, Lcom/friday/common/property/BaseResponse;

    iget-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->j:Ljava/lang/Object;

    check-cast v11, Lcom/friday/document/model/ResourceDeleteEntity;

    iget-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    move-object/from16 v16, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    move-object/from16 p1, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v17, v10

    move-object v10, v0

    move v0, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v15

    move-object v15, v6

    move-object/from16 v6, v17

    move-object/from16 v17, v11

    move-object/from16 v11, p1

    goto/16 :goto_12

    :pswitch_1
    move-object/from16 v16, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->j:Ljava/lang/Object;

    check-cast v1, Lcom/friday/document/model/ResourceDeleteEntity;

    iget-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v15, v6

    move-object v13, v11

    move-object v6, v5

    move-object v11, v10

    move-object v10, v0

    move-object v5, v4

    move-object v0, v14

    move-object v4, v3

    move-object v3, v1

    move-object/from16 v1, v16

    goto/16 :goto_f

    :pswitch_2
    move-object/from16 v16, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->l:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->k:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->j:Ljava/lang/Object;

    check-cast v3, Lcom/friday/common/property/BaseResponse;

    iget-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v23, v9

    move-object/from16 v24, v13

    move-object/from16 v26, v14

    move-object v9, v5

    move-object v5, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v11

    move-object v11, v15

    move-object v15, v6

    move-object v6, v10

    move-object v10, v0

    move-object v0, v1

    const/4 v1, 0x0

    goto/16 :goto_d

    :pswitch_3
    move-object/from16 v16, v1

    iget-boolean v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->u:Z

    iget v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->s:I

    iget v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->r:I

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->q:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/ResourceEntity;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->p:Ljava/lang/Object;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->o:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->n:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    iget-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->m:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->l:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    move/from16 p1, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->k:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 p2, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->j:Ljava/lang/Object;

    check-cast v1, Lcom/friday/common/property/BaseResponse;

    move-object/from16 v18, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 v19, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 v20, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 v21, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 v22, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    move-object/from16 v23, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    move-object/from16 v24, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v0, v12

    move-object v12, v9

    move-object/from16 v9, v24

    move-object/from16 v24, v13

    move-object v13, v0

    move-object/from16 v16, v11

    move-object/from16 v26, v14

    move-object/from16 v0, v18

    move-object/from16 v11, v19

    move-object/from16 v19, v21

    move-object/from16 v17, v23

    move-object/from16 v18, v10

    move-object/from16 v21, v15

    move-object v15, v6

    move-object v10, v8

    move v6, v3

    move-object v8, v7

    move-object v3, v1

    move-object v7, v5

    move/from16 v1, p1

    move v5, v4

    move-object/from16 v4, p2

    goto/16 :goto_b

    :pswitch_4
    move-object/from16 v16, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v18, v11

    move-object v11, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v15

    move-object v15, v6

    move-object/from16 v6, v18

    move-object/from16 v18, v10

    goto/16 :goto_9

    :pswitch_5
    move-object/from16 v16, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v15, v6

    move-object v6, v9

    move-object v9, v8

    move-object v8, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v11

    goto/16 :goto_7

    :pswitch_6
    move-object/from16 v16, v1

    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static/range {v16 .. v16}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v4, v3

    move-object v15, v6

    goto :goto_3

    :pswitch_7
    move-object/from16 v16, v1

    invoke-static/range {v16 .. v16}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v3, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    move-object/from16 v4, p1

    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    move-object/from16 v1, p2

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    move-object v8, v6

    const-wide/16 v5, 0x0

    move-object v9, v8

    const/4 v8, 0x2

    move-object v15, v9

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    :goto_2
    move-object v10, v0

    goto/16 :goto_11

    :cond_1
    move-object/from16 v4, p1

    move-object/from16 v16, v3

    .line 3
    :goto_3
    move-object/from16 v3, v16

    check-cast v3, Ljava/util/List;

    .line 4
    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    .line 5
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/friday/common/entity/ResourceEntity;

    .line 7
    invoke-virtual {v9}, Lcom/friday/common/entity/ResourceEntity;->getToBeUploaded()Z

    move-result v9

    if-nez v9, :cond_2

    .line 8
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 9
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 10
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_5

    move/from16 p1, v8

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v16, v8

    check-cast v16, Lcom/friday/common/entity/ResourceEntity;

    .line 11
    invoke-virtual/range {v16 .. v16}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/lang/CharSequence;->length()I

    move-result v16

    if-lez v16, :cond_4

    .line 12
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    move/from16 v8, p1

    goto :goto_5

    .line 13
    :cond_5
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    move-object/from16 v16, v11

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v9, :cond_7

    move/from16 p1, v9

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v17, v9

    check-cast v17, Lcom/friday/common/entity/ResourceEntity;

    .line 15
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Ljava/lang/CharSequence;->length()I

    move-result v17

    if-nez v17, :cond_6

    .line 16
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6
    move/from16 v9, p1

    goto :goto_6

    .line 17
    :cond_7
    iget-object v9, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    move-object/from16 v17, v5

    move-object v11, v6

    const-wide/16 v5, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x2

    move-object/from16 v19, v3

    move-object v3, v9

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->y(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_8

    goto/16 :goto_2

    :cond_8
    move-object v9, v1

    move-object v1, v3

    move-object v6, v4

    move-object v5, v11

    move-object/from16 v4, v17

    move-object/from16 v3, v18

    move-object/from16 v8, v19

    .line 18
    :goto_7
    check-cast v1, Ljava/lang/Iterable;

    .line 19
    new-instance v11, Ljava/util/ArrayList;

    move-object/from16 p1, v3

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 21
    check-cast v3, Lcom/friday/common/entity/ResourceEntity;

    .line 22
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v3

    .line 23
    invoke-interface {v11, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 24
    :cond_9
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    move-object/from16 p2, v5

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v5

    move-object/from16 v17, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v10

    const-string v10, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u6587\u4ef6id="

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\uff0c\u8d44\u6e90\u603b\u6570="

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\uff0c\u5f85\u5199\u540e\u7aef\u8d44\u6e90\u6570="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\uff0c\u5f85\u5220\u9664\u8d44\u6e90\u6570="

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 25
    move-object/from16 v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a

    .line 26
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v1

    .line 27
    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/Iterable;

    const/16 v5, 0x14

    invoke-static {v3, v5}, Lrc/g0;->Q0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    move-object/from16 v26, v3

    check-cast v26, Ljava/lang/Iterable;

    new-instance v32, Lt2/a;

    invoke-direct/range {v32 .. v32}, Lt2/a;-><init>()V

    const/16 v33, 0x1f

    const/16 v34, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v26 .. v34}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u53d1\u73b0\u5df2\u5b8c\u6210\u72b6\u6001\u4f46 ossImageUrl \u4e3a\u7a7a\u7684\u8d44\u6e90\uff0c\u8df3\u8fc7\u5199\u540e\u7aef\uff0c\u6587\u4ef6id="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\uff0c\u6570\u91cf="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 28
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 29
    :cond_a
    move-object v1, v4

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_15

    .line 30
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    .line 31
    move-object v3, v4

    check-cast v3, Ljava/lang/Iterable;

    const/16 v5, 0x14

    invoke-static {v3, v5}, Lrc/g0;->Q0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    move-object/from16 v26, v3

    check-cast v26, Ljava/lang/Iterable;

    new-instance v32, Lt2/b;

    invoke-direct/range {v32 .. v32}, Lt2/b;-><init>()V

    const/16 v33, 0x1f

    const/16 v34, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v26 .. v34}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u51c6\u5907\u8c03\u7528 CloudNotes/api/Resources/AddOrUpdate\uff0c\u6587\u4ef6id="

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 32
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 33
    iget-object v1, v0, Lcom/friday/document/sync/SyncStateOne;->a:Ls2/a;

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    const/4 v3, 0x3

    iput v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    invoke-interface {v1, v4, v7}, Ls2/a;->g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_b

    goto/16 :goto_2

    :cond_b
    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move-object/from16 v8, v17

    .line 34
    :goto_9
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 35
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v10

    move-object/from16 p1, v1

    const/16 v1, 0x7d9

    if-ne v10, v1, :cond_13

    .line 36
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 37
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v10

    .line 38
    move-object v12, v1

    check-cast v12, Ljava/lang/Iterable;

    move-object/from16 p2, v1

    const/16 v1, 0x14

    invoke-static {v12, v1}, Lrc/g0;->Q0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v12

    move-object/from16 v26, v12

    check-cast v26, Ljava/lang/Iterable;

    const/16 v33, 0x3f

    const/16 v34, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v26 .. v34}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 39
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v17, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v4

    const-string v4, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0cCloudNotes/api/Resources/AddOrUpdate \u90e8\u5206\u5931\u8d25\uff0c\u6587\u4ef6id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\uff0c\u5931\u8d25\u6570\u91cf="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "\uff0c\u5931\u8d25\u8d44\u6e90\u793a\u4f8b="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 40
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 41
    move-object/from16 v4, v19

    check-cast v4, Ljava/lang/Iterable;

    .line 42
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v10, v1

    move-object/from16 v20, v4

    move-object/from16 v21, v20

    move-object v12, v5

    move-object/from16 v4, v17

    const/4 v5, 0x0

    move-object/from16 v1, p2

    move-object/from16 v17, v8

    move-object v8, v3

    move-object v3, v6

    const/4 v6, 0x0

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_f

    move-object/from16 p2, v4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v22, v4

    check-cast v22, Lcom/friday/common/entity/ResourceEntity;

    move-object/from16 v23, v12

    .line 44
    invoke-virtual/range {v22 .. v22}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v1, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    move-object/from16 v24, v13

    if-nez v12, :cond_d

    .line 45
    iget-object v13, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    move-object/from16 v26, v14

    invoke-virtual/range {v22 .. v22}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v14

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->j:Ljava/lang/Object;

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->k:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->l:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->m:Ljava/lang/Object;

    iput-object v10, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->n:Ljava/lang/Object;

    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->o:Ljava/lang/Object;

    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->p:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->q:Ljava/lang/Object;

    iput v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->r:I

    iput v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->s:I

    const/4 v0, 0x0

    iput v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->t:I

    iput-boolean v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->u:Z

    const/4 v0, 0x4

    iput v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    invoke-interface {v13, v14, v7}, Lcom/friday/common/dao/ResourceDao;->H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_c

    move-object/from16 v10, p0

    goto/16 :goto_11

    :cond_c
    move-object v0, v4

    move-object v4, v1

    move v1, v12

    move-object v12, v10

    move-object v10, v8

    move-object v8, v7

    move-object v7, v0

    move-object/from16 v0, p1

    move-object/from16 v13, v20

    move-object/from16 v22, v23

    move-object/from16 v20, p2

    :goto_b
    move-object/from16 v35, v12

    move v12, v1

    move-object v1, v4

    move-object v4, v7

    move-object v7, v8

    move-object v8, v10

    move-object/from16 v10, v35

    goto :goto_c

    :cond_d
    move-object/from16 v26, v14

    move-object/from16 v0, p1

    move-object/from16 v13, v20

    move-object/from16 v22, v23

    move-object/from16 v20, p2

    :goto_c
    if-eqz v12, :cond_e

    .line 46
    invoke-interface {v10, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_e
    move-object/from16 p1, v0

    move-object/from16 v4, v20

    move-object/from16 v12, v22

    move-object/from16 v14, v26

    move-object/from16 v0, p0

    move-object/from16 v20, v13

    move-object/from16 v13, v24

    goto/16 :goto_a

    :cond_f
    move-object/from16 p2, v4

    move-object/from16 v23, v12

    move-object/from16 v24, v13

    move-object/from16 v26, v14

    .line 47
    move-object v0, v10

    check-cast v0, Ljava/util/List;

    .line 48
    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_12

    .line 49
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u5f00\u59cb\u91cd\u8bd5 CloudNotes/api/Resources/AddOrUpdate\uff0c\u6587\u4ef6id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v6, v18

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 50
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    move-object/from16 v10, p0

    .line 51
    iget-object v4, v10, Lcom/friday/document/sync/SyncStateOne;->a:Ls2/a;

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->j:Ljava/lang/Object;

    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->k:Ljava/lang/Object;

    iput-object v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->l:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->m:Ljava/lang/Object;

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->n:Ljava/lang/Object;

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->o:Ljava/lang/Object;

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->p:Ljava/lang/Object;

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->q:Ljava/lang/Object;

    const/4 v5, 0x5

    iput v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    invoke-interface {v4, v0, v7}, Ls2/a;->g(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_10

    goto/16 :goto_11

    :cond_10
    move-object v5, v11

    move-object v11, v3

    move-object v3, v5

    move-object/from16 v5, p2

    move-object/from16 v12, v17

    move-object/from16 v8, v19

    .line 52
    :goto_d
    check-cast v4, Lcom/friday/common/property/BaseResponse;

    .line 53
    invoke-virtual {v4}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v13

    if-nez v13, :cond_11

    .line 54
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u91cd\u8bd5 CloudNotes/api/Resources/AddOrUpdate \u6210\u529f\uff0c\u6587\u4ef6id="

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 55
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    move-object v4, v5

    move-object v5, v8

    move-object v6, v9

    move-object v9, v12

    move-object/from16 v13, v16

    move-object/from16 v8, v23

    move-object/from16 v0, v26

    move-object v12, v11

    goto/16 :goto_e

    .line 56
    :cond_11
    invoke-virtual {v4}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v0

    invoke-virtual {v4}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u91cd\u8bd5 CloudNotes/api/Resources/AddOrUpdate \u5931\u8d25\uff0c\u6587\u4ef6id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v13, v16

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v0, v26

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 58
    sget-object v0, Lcom/friday/common/util/SyncException;->e:Lcom/friday/common/util/SyncException$a;

    .line 59
    invoke-virtual {v4}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v1

    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v1

    .line 60
    invoke-virtual {v4}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    move-result-object v2

    .line 61
    invoke-virtual {v0, v1, v2}, Lcom/friday/common/util/SyncException$a;->c(Ljava/lang/Integer;Ljava/lang/String;)Lcom/friday/common/util/SyncException;

    move-result-object v0

    throw v0

    :cond_12
    move-object/from16 v10, p0

    move-object/from16 v13, v16

    move-object/from16 v0, v26

    const/4 v1, 0x0

    move-object/from16 v4, p2

    move-object v12, v3

    move-object v6, v9

    move-object v3, v11

    move-object/from16 v9, v17

    move-object/from16 v5, v19

    move-object/from16 v8, v23

    goto/16 :goto_e

    :cond_13
    move-object v10, v0

    move-object/from16 v17, v3

    move-object/from16 v19, v4

    move-object/from16 v24, v13

    move-object v0, v14

    move-object/from16 v13, v16

    const/4 v1, 0x0

    .line 62
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v3

    if-nez v3, :cond_14

    .line 63
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0cCloudNotes/api/Resources/AddOrUpdate \u6210\u529f\uff0c\u6587\u4ef6id="

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    .line 64
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    move-object v12, v6

    move-object v6, v9

    move-object v3, v11

    move-object/from16 v4, v17

    move-object v9, v8

    move-object v8, v5

    move-object/from16 v5, v19

    goto/16 :goto_e

    .line 65
    :cond_14
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    move-result-object v2

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0cCloudNotes/api/Resources/AddOrUpdate \u5931\u8d25\uff0c\u6587\u4ef6id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 66
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 67
    sget-object v0, Lcom/friday/common/util/SyncException;->e:Lcom/friday/common/util/SyncException$a;

    .line 68
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v1

    invoke-static {v1}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v1

    .line 69
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    move-result-object v2

    .line 70
    invoke-virtual {v0, v1, v2}, Lcom/friday/common/util/SyncException$a;->c(Ljava/lang/Integer;Ljava/lang/String;)Lcom/friday/common/util/SyncException;

    move-result-object v0

    throw v0

    :cond_15
    move-object v10, v0

    move-object/from16 v24, v13

    move-object v0, v14

    move-object/from16 v13, v16

    const/4 v1, 0x0

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u5f53\u524d\u6ca1\u6709\u9700\u8981\u5199\u540e\u7aef\u7684\u65b0\u589e\u6216\u66f4\u65b0\u8d44\u6e90\uff0c\u6587\u4ef6id="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    move-object/from16 v8, p2

    move-object v5, v4

    move-object v12, v6

    move-object v6, v9

    move-object v3, v11

    move-object/from16 v9, v17

    move-object/from16 v4, p1

    .line 72
    :goto_e
    move-object v11, v3

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_1a

    .line 73
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v11

    .line 74
    move-object v14, v3

    check-cast v14, Ljava/lang/Iterable;

    const/16 v1, 0x14

    invoke-static {v14, v1}, Lrc/g0;->Q0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    move-object/from16 v25, v1

    check-cast v25, Ljava/lang/Iterable;

    const/16 v32, 0x3f

    const/16 v33, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v25 .. v33}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 p1, v4

    const-string v4, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u51c6\u5907\u8c03\u7528 CloudNotes/api/Resources/Delete\uff0c\u6587\u4ef6id="

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\uff0c\u5f85\u5220\u8d44\u6e90\u6570="

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v4, v24

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 75
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 76
    new-instance v1, Lcom/friday/document/model/ResourceDeleteEntity;

    invoke-direct {v1, v12, v3}, Lcom/friday/document/model/ResourceDeleteEntity;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 77
    iget-object v4, v10, Lcom/friday/document/sync/SyncStateOne;->a:Ls2/a;

    .line 78
    filled-new-array {v1}, [Lcom/friday/document/model/ResourceDeleteEntity;

    move-result-object v11

    .line 79
    invoke-static {v11}, Lrc/w;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v11

    .line 80
    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->j:Ljava/lang/Object;

    const/4 v14, 0x0

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->k:Ljava/lang/Object;

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->l:Ljava/lang/Object;

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->m:Ljava/lang/Object;

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->n:Ljava/lang/Object;

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->o:Ljava/lang/Object;

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->p:Ljava/lang/Object;

    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->q:Ljava/lang/Object;

    const/4 v14, 0x6

    iput v14, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    invoke-interface {v4, v11, v7}, Ls2/a;->e(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_16

    goto/16 :goto_11

    :cond_16
    move-object v11, v3

    move-object v3, v1

    move-object v1, v4

    move-object v4, v11

    move-object v11, v6

    move-object v6, v5

    move-object/from16 v5, p1

    .line 81
    :goto_f
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 82
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v14

    if-nez v14, :cond_19

    .line 83
    move-object v0, v4

    check-cast v0, Ljava/lang/Iterable;

    .line 84
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move-object v14, v6

    move-object v6, v8

    move-object v8, v13

    move-object v13, v5

    move-object v5, v3

    move-object v3, v1

    move-object v1, v12

    move-object v12, v4

    move-object v4, v9

    move-object v9, v0

    const/4 v0, 0x0

    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_18

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 p1, v3

    move-object/from16 v3, v16

    check-cast v3, Ljava/lang/String;

    move-object/from16 p2, v4

    .line 85
    iget-object v4, v10, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->c:Ljava/lang/Object;

    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->d:Ljava/lang/Object;

    move-object/from16 v17, v5

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->e:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->f:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->g:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->h:Ljava/lang/Object;

    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->j:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->k:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->l:Ljava/lang/Object;

    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->m:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->n:Ljava/lang/Object;

    iput-object v3, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->o:Ljava/lang/Object;

    iput v0, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->r:I

    const/4 v5, 0x0

    iput v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->s:I

    const/4 v5, 0x7

    iput v5, v7, Lcom/friday/document/sync/SyncStateOne$uploadServiceResource$1;->x:I

    invoke-interface {v4, v3, v7}, Lcom/friday/common/dao/ResourceDao;->Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_17

    :goto_11
    return-object v2

    :cond_17
    move-object/from16 v4, p2

    move-object v5, v3

    move-object/from16 v3, p1

    .line 86
    :goto_12
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    move-object/from16 v5, v17

    goto :goto_10

    .line 87
    :cond_18
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0cCloudNotes/api/Resources/Delete \u6210\u529f\uff0c\u6587\u4ef6id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\uff0c\u5220\u9664\u8d44\u6e90\u6570="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 88
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    move-object v12, v1

    move-object v6, v11

    goto :goto_13

    .line 89
    :cond_19
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v2

    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0cCloudNotes/api/Resources/Delete \u5931\u8d25\uff0c\u6587\u4ef6id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 90
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 91
    sget-object v0, Lcom/friday/common/util/SyncException;->e:Lcom/friday/common/util/SyncException$a;

    .line 92
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v2

    invoke-static {v2}, Lxc/a;->c(I)Ljava/lang/Integer;

    move-result-object v2

    .line 93
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    move-result-object v1

    .line 94
    invoke-virtual {v0, v2, v1}, Lcom/friday/common/util/SyncException$a;->c(Ljava/lang/Integer;Ljava/lang/String;)Lcom/friday/common/util/SyncException;

    move-result-object v0

    throw v0

    .line 95
    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u5f53\u524d\u6ca1\u6709\u5f85\u5220\u9664\u8d44\u6e90\uff0c\u6587\u4ef6id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 96
    :goto_13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u9875\u9762 SyncStateOne.kt -> uploadServiceResource\uff0c\u4e91\u7aef\u8d44\u6e90\u540c\u6b65\u5b8c\u6210\uff0c\u6587\u4ef6id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 97
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final E(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->o:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    .line 36
    .line 37
    const-string v5, "\uff0c\u6587\u4ef6\u540d="

    .line 38
    .line 39
    const/4 v6, 0x5

    .line 40
    const/4 v7, 0x4

    .line 41
    const/4 v8, 0x3

    .line 42
    const/4 v9, 0x2

    .line 43
    const/4 v10, 0x1

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    if-eqz v4, :cond_6

    .line 47
    .line 48
    if-eq v4, v10, :cond_5

    .line 49
    .line 50
    if-eq v4, v9, :cond_4

    .line 51
    .line 52
    if-eq v4, v8, :cond_3

    .line 53
    .line 54
    if-eq v4, v7, :cond_2

    .line 55
    .line 56
    if-ne v4, v6, :cond_1

    .line 57
    .line 58
    iget-object v3, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->j:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->i:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, Lcom/friday/common/helper/OssUploadHelper;

    .line 65
    .line 66
    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v4, Lcom/friday/common/entity/OssTokenResponse;

    .line 69
    .line 70
    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, Lcom/friday/common/entity/OssReqData;

    .line 73
    .line 74
    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, Ljava/lang/String;

    .line 77
    .line 78
    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v4, Ljava/lang/String;

    .line 81
    .line 82
    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    iget-object v2, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_18

    .line 94
    .line 95
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 98
    .line 99
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0

    .line 103
    :cond_2
    iget v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 104
    .line 105
    iget-object v5, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->l:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Lcom/friday/common/entity/OssTokenResponse;

    .line 108
    .line 109
    iget-object v5, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->k:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v5, Lcom/friday/common/entity/OssReqData;

    .line 112
    .line 113
    iget-object v5, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->j:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v5, Ljava/lang/String;

    .line 116
    .line 117
    iget-object v7, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->i:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v7, Lcom/friday/common/helper/OssUploadHelper;

    .line 120
    .line 121
    iget-object v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->h:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v8, Lcom/friday/common/entity/OssTokenResponse;

    .line 124
    .line 125
    iget-object v9, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v9, Lcom/friday/common/entity/OssReqData;

    .line 128
    .line 129
    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v10, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v11, Ljava/lang/String;

    .line 136
    .line 137
    iget-object v13, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v13, Ljava/lang/String;

    .line 140
    .line 141
    iget-object v14, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v14, Lcom/friday/common/entity/FileEntity;

    .line 144
    .line 145
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_15

    .line 149
    .line 150
    :cond_3
    iget v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 151
    .line 152
    iget-object v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->k:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v8, Lcom/friday/common/entity/OssReqData;

    .line 155
    .line 156
    iget-object v9, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->j:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v9, Ljava/lang/String;

    .line 159
    .line 160
    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->i:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v10, Lcom/friday/common/helper/OssUploadHelper;

    .line 163
    .line 164
    iget-object v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->h:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v11, Lcom/friday/common/entity/OssTokenResponse;

    .line 167
    .line 168
    iget-object v13, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v13, Lcom/friday/common/entity/OssReqData;

    .line 171
    .line 172
    iget-object v14, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v14, Ljava/lang/String;

    .line 175
    .line 176
    iget-object v15, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v15, Ljava/lang/String;

    .line 179
    .line 180
    iget-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v6, Ljava/lang/String;

    .line 183
    .line 184
    iget-object v7, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v7, Lcom/friday/common/entity/FileEntity;

    .line 187
    .line 188
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 189
    .line 190
    .line 191
    goto/16 :goto_10

    .line 192
    .line 193
    :catchall_0
    move-exception v0

    .line 194
    goto/16 :goto_13

    .line 195
    .line 196
    :cond_4
    iget v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 197
    .line 198
    iget-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->i:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v6, Lcom/friday/common/helper/OssUploadHelper;

    .line 201
    .line 202
    iget-object v7, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->h:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v7, Lcom/friday/common/entity/OssTokenResponse;

    .line 205
    .line 206
    iget-object v9, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v9, Lcom/friday/common/entity/OssReqData;

    .line 209
    .line 210
    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v10, Ljava/lang/String;

    .line 213
    .line 214
    iget-object v13, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v13, Ljava/lang/String;

    .line 217
    .line 218
    iget-object v14, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v14, Ljava/lang/String;

    .line 221
    .line 222
    iget-object v15, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v15, Lcom/friday/common/entity/FileEntity;

    .line 225
    .line 226
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto/16 :goto_e

    .line 230
    .line 231
    :cond_5
    iget v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 232
    .line 233
    iget-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v6, Lcom/friday/common/entity/OssReqData;

    .line 236
    .line 237
    iget-object v7, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v7, Ljava/lang/String;

    .line 240
    .line 241
    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v10, Ljava/lang/String;

    .line 244
    .line 245
    iget-object v13, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v13, Ljava/lang/String;

    .line 248
    .line 249
    iget-object v14, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v14, Lcom/friday/common/entity/FileEntity;

    .line 252
    .line 253
    :try_start_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 254
    .line 255
    .line 256
    goto/16 :goto_6

    .line 257
    .line 258
    :catchall_1
    move-exception v0

    .line 259
    move-object v15, v14

    .line 260
    goto/16 :goto_a

    .line 261
    .line 262
    :cond_6
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const-string v4, "6"

    .line 270
    .line 271
    invoke-static {v0, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_7

    .line 276
    .line 277
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    :goto_1
    move-object v13, v0

    .line 282
    goto :goto_2

    .line 283
    :cond_7
    const-string v4, "11"

    .line 284
    .line 285
    invoke-static {v0, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_8

    .line 290
    .line 291
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getZipFilePath()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    goto :goto_1

    .line 296
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    goto :goto_1

    .line 301
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-lez v0, :cond_9

    .line 310
    .line 311
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    const-string v4, "http"

    .line 316
    .line 317
    invoke-static {v0, v4, v11, v9, v12}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-nez v0, :cond_9

    .line 322
    .line 323
    move v4, v10

    .line 324
    goto :goto_3

    .line 325
    :cond_9
    move v4, v11

    .line 326
    :goto_3
    const-string v0, "0"

    .line 327
    .line 328
    if-eqz v4, :cond_a

    .line 329
    .line 330
    :goto_4
    move-object/from16 v20, v0

    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v16

    .line 337
    const-string v6, "/"

    .line 338
    .line 339
    filled-new-array {v6}, [Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v17

    .line 343
    const/16 v20, 0x6

    .line 344
    .line 345
    const/16 v21, 0x0

    .line 346
    .line 347
    const/16 v18, 0x0

    .line 348
    .line 349
    const/16 v19, 0x0

    .line 350
    .line 351
    invoke-static/range {v16 .. v21}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    const/4 v7, 0x6

    .line 356
    invoke-static {v6, v7}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    check-cast v6, Ljava/lang/String;

    .line 361
    .line 362
    if-nez v6, :cond_b

    .line 363
    .line 364
    goto :goto_4

    .line 365
    :cond_b
    move-object/from16 v20, v6

    .line 366
    .line 367
    :goto_5
    invoke-static {v13}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    new-instance v6, Ljava/lang/StringBuilder;

    .line 372
    .line 373
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 374
    .line 375
    .line 376
    const-string v7, "."

    .line 377
    .line 378
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v18

    .line 388
    sget-object v16, Lcom/friday/common/helper/OssUploadHelper;->b:Lcom/friday/common/helper/OssUploadHelper$a;

    .line 389
    .line 390
    sget-object v17, Lcom/friday/common/entity/OssFileType$File;->INSTANCE:Lcom/friday/common/entity/OssFileType$File;

    .line 391
    .line 392
    sget-object v19, Lcom/friday/common/entity/OssFileResource$Resource;->INSTANCE:Lcom/friday/common/entity/OssFileResource$Resource;

    .line 393
    .line 394
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v21

    .line 398
    const/16 v24, 0x20

    .line 399
    .line 400
    const/16 v25, 0x0

    .line 401
    .line 402
    const-wide/16 v22, 0x0

    .line 403
    .line 404
    invoke-static/range {v16 .. v25}, Lcom/friday/common/helper/OssUploadHelper$a;->b(Lcom/friday/common/helper/OssUploadHelper$a;Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/friday/common/entity/OssReqData;

    .line 405
    .line 406
    .line 407
    move-result-object v6

    .line 408
    move-object/from16 v7, v20

    .line 409
    .line 410
    :try_start_2
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 411
    .line 412
    iget-object v0, v1, Lcom/friday/document/sync/SyncStateOne;->b:Ld2/i;

    .line 413
    .line 414
    invoke-virtual {v6}, Lcom/friday/common/entity/OssReqData;->getTokenReq()Lcom/friday/common/entity/OssTokenReq;

    .line 415
    .line 416
    .line 417
    move-result-object v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 418
    move-object/from16 v15, p1

    .line 419
    .line 420
    :try_start_3
    iput-object v15, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 421
    .line 422
    iput-object v13, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 423
    .line 424
    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 425
    .line 426
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v12

    .line 430
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 431
    .line 432
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 433
    .line 434
    iput v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 435
    .line 436
    iput v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->n:I

    .line 437
    .line 438
    iput v10, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    .line 439
    .line 440
    invoke-interface {v0, v14, v2}, Ld2/i;->a(Lcom/friday/common/entity/OssTokenReq;Lvc/c;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 444
    if-ne v0, v3, :cond_c

    .line 445
    .line 446
    goto/16 :goto_17

    .line 447
    .line 448
    :cond_c
    move-object v10, v7

    .line 449
    move-object v14, v15

    .line 450
    move-object/from16 v7, v18

    .line 451
    .line 452
    :goto_6
    :try_start_4
    check-cast v0, Lcom/friday/common/entity/OssTokenResult;

    .line 453
    .line 454
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getSuccess()Z

    .line 455
    .line 456
    .line 457
    move-result v12

    .line 458
    if-eqz v12, :cond_d

    .line 459
    .line 460
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getResult()Lcom/friday/common/entity/OssTokenResponse;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    goto :goto_7

    .line 465
    :cond_d
    const/4 v0, 0x0

    .line 466
    :goto_7
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 470
    move-object v15, v14

    .line 471
    :goto_8
    move-object v14, v13

    .line 472
    move-object v13, v10

    .line 473
    move-object v10, v7

    .line 474
    goto :goto_b

    .line 475
    :catchall_2
    move-exception v0

    .line 476
    :goto_9
    move-object v10, v7

    .line 477
    move-object/from16 v7, v18

    .line 478
    .line 479
    goto :goto_a

    .line 480
    :catchall_3
    move-exception v0

    .line 481
    move-object/from16 v15, p1

    .line 482
    .line 483
    goto :goto_9

    .line 484
    :goto_a
    sget-object v12, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 485
    .line 486
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    goto :goto_8

    .line 495
    :goto_b
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    if-eqz v7, :cond_e

    .line 500
    .line 501
    const/4 v0, 0x0

    .line 502
    :cond_e
    move-object v7, v0

    .line 503
    check-cast v7, Lcom/friday/common/entity/OssTokenResponse;

    .line 504
    .line 505
    if-eqz v7, :cond_1a

    .line 506
    .line 507
    new-instance v0, Lcom/friday/common/helper/OssUploadHelper;

    .line 508
    .line 509
    invoke-direct {v0, v7}, Lcom/friday/common/helper/OssUploadHelper;-><init>(Lcom/friday/common/entity/OssTokenResponse;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->isMicroClass()Z

    .line 513
    .line 514
    .line 515
    move-result v12

    .line 516
    if-eqz v12, :cond_10

    .line 517
    .line 518
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v12

    .line 522
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 523
    .line 524
    .line 525
    move-result v12

    .line 526
    if-nez v12, :cond_f

    .line 527
    .line 528
    goto :goto_d

    .line 529
    :cond_f
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v9

    .line 533
    move-object/from16 v22, v13

    .line 534
    .line 535
    move-object v13, v6

    .line 536
    move-object v6, v14

    .line 537
    move-object v14, v10

    .line 538
    move-object v10, v0

    .line 539
    :goto_c
    move-object v8, v7

    .line 540
    move-object v7, v15

    .line 541
    goto :goto_f

    .line 542
    :cond_10
    :goto_d
    invoke-virtual {v6}, Lcom/friday/common/entity/OssReqData;->getObjectKey()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v12

    .line 546
    iput-object v15, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 547
    .line 548
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    iput-object v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 553
    .line 554
    iput-object v13, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 555
    .line 556
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v8

    .line 560
    iput-object v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 561
    .line 562
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 563
    .line 564
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v8

    .line 568
    iput-object v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->h:Ljava/lang/Object;

    .line 569
    .line 570
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v8

    .line 574
    iput-object v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->i:Ljava/lang/Object;

    .line 575
    .line 576
    iput v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 577
    .line 578
    iput v9, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    .line 579
    .line 580
    invoke-virtual {v0, v14, v12, v2}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    if-ne v8, v3, :cond_11

    .line 585
    .line 586
    goto/16 :goto_17

    .line 587
    .line 588
    :cond_11
    move-object v9, v6

    .line 589
    move-object v6, v0

    .line 590
    move-object v0, v8

    .line 591
    :goto_e
    check-cast v0, Ljava/lang/String;

    .line 592
    .line 593
    move-object v8, v10

    .line 594
    move-object v10, v6

    .line 595
    move-object v6, v14

    .line 596
    move-object v14, v8

    .line 597
    move-object/from16 v22, v13

    .line 598
    .line 599
    move-object v13, v9

    .line 600
    move-object v9, v0

    .line 601
    goto :goto_c

    .line 602
    :goto_f
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->isMicroClass()Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-eqz v0, :cond_17

    .line 607
    .line 608
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    if-lez v0, :cond_17

    .line 617
    .line 618
    sget-object v18, Lcom/friday/common/helper/OssUploadHelper;->b:Lcom/friday/common/helper/OssUploadHelper$a;

    .line 619
    .line 620
    sget-object v19, Lcom/friday/common/entity/OssFileType$File;->INSTANCE:Lcom/friday/common/entity/OssFileType$File;

    .line 621
    .line 622
    sget-object v21, Lcom/friday/common/entity/OssFileResource$Resource;->INSTANCE:Lcom/friday/common/entity/OssFileResource$Resource;

    .line 623
    .line 624
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v23

    .line 628
    const/16 v26, 0x20

    .line 629
    .line 630
    const/16 v27, 0x0

    .line 631
    .line 632
    const-string v20, ".jpg"

    .line 633
    .line 634
    const-wide/16 v24, 0x0

    .line 635
    .line 636
    invoke-static/range {v18 .. v27}, Lcom/friday/common/helper/OssUploadHelper$a;->b(Lcom/friday/common/helper/OssUploadHelper$a;Lcom/friday/common/entity/OssFileType;Ljava/lang/String;Lcom/friday/common/entity/OssFileResource;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lcom/friday/common/entity/OssReqData;

    .line 637
    .line 638
    .line 639
    move-result-object v12

    .line 640
    :try_start_5
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 641
    .line 642
    iget-object v0, v1, Lcom/friday/document/sync/SyncStateOne;->b:Ld2/i;

    .line 643
    .line 644
    invoke-virtual {v13}, Lcom/friday/common/entity/OssReqData;->getTokenReq()Lcom/friday/common/entity/OssTokenReq;

    .line 645
    .line 646
    .line 647
    move-result-object v15

    .line 648
    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 649
    .line 650
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v11

    .line 654
    iput-object v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 655
    .line 656
    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v11

    .line 660
    iput-object v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 661
    .line 662
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v11

    .line 666
    iput-object v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 667
    .line 668
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v11

    .line 672
    iput-object v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 673
    .line 674
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v11

    .line 678
    iput-object v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->h:Ljava/lang/Object;

    .line 679
    .line 680
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v11

    .line 684
    iput-object v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->i:Ljava/lang/Object;

    .line 685
    .line 686
    iput-object v9, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->j:Ljava/lang/Object;

    .line 687
    .line 688
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->k:Ljava/lang/Object;

    .line 689
    .line 690
    iput v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 691
    .line 692
    const/4 v11, 0x0

    .line 693
    iput v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->n:I

    .line 694
    .line 695
    const/4 v11, 0x3

    .line 696
    iput v11, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    .line 697
    .line 698
    invoke-interface {v0, v15, v2}, Ld2/i;->a(Lcom/friday/common/entity/OssTokenReq;Lvc/c;)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 702
    if-ne v0, v3, :cond_12

    .line 703
    .line 704
    goto/16 :goto_17

    .line 705
    .line 706
    :cond_12
    move-object v11, v8

    .line 707
    move-object v8, v12

    .line 708
    move-object/from16 v15, v22

    .line 709
    .line 710
    :goto_10
    :try_start_6
    check-cast v0, Lcom/friday/common/entity/OssTokenResult;

    .line 711
    .line 712
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getSuccess()Z

    .line 713
    .line 714
    .line 715
    move-result v12

    .line 716
    if-eqz v12, :cond_13

    .line 717
    .line 718
    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResult;->getResult()Lcom/friday/common/entity/OssTokenResponse;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    goto :goto_11

    .line 723
    :cond_13
    const/4 v0, 0x0

    .line 724
    :goto_11
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 728
    :goto_12
    move-object/from16 v28, v14

    .line 729
    .line 730
    move-object v14, v7

    .line 731
    move-object v7, v10

    .line 732
    move-object/from16 v10, v28

    .line 733
    .line 734
    goto :goto_14

    .line 735
    :catchall_4
    move-exception v0

    .line 736
    move-object v11, v8

    .line 737
    move-object v8, v12

    .line 738
    move-object/from16 v15, v22

    .line 739
    .line 740
    :goto_13
    sget-object v12, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 741
    .line 742
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    goto :goto_12

    .line 751
    :goto_14
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v12

    .line 755
    if-eqz v12, :cond_14

    .line 756
    .line 757
    const/4 v0, 0x0

    .line 758
    :cond_14
    check-cast v0, Lcom/friday/common/entity/OssTokenResponse;

    .line 759
    .line 760
    if-eqz v0, :cond_16

    .line 761
    .line 762
    new-instance v5, Lcom/friday/common/helper/OssUploadHelper;

    .line 763
    .line 764
    invoke-direct {v5, v0}, Lcom/friday/common/helper/OssUploadHelper;-><init>(Lcom/friday/common/entity/OssTokenResponse;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v14}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v12

    .line 771
    move-object/from16 p1, v0

    .line 772
    .line 773
    invoke-virtual {v14}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    new-instance v1, Ljava/lang/StringBuilder;

    .line 778
    .line 779
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    const-string v0, ".jpg"

    .line 789
    .line 790
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 791
    .line 792
    .line 793
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-virtual {v8}, Lcom/friday/common/entity/OssReqData;->getObjectKey()Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    iput-object v14, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 802
    .line 803
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v12

    .line 807
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 808
    .line 809
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v12

    .line 813
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 814
    .line 815
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v12

    .line 819
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 820
    .line 821
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v12

    .line 825
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 826
    .line 827
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v12

    .line 831
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->h:Ljava/lang/Object;

    .line 832
    .line 833
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v12

    .line 837
    iput-object v12, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->i:Ljava/lang/Object;

    .line 838
    .line 839
    iput-object v9, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->j:Ljava/lang/Object;

    .line 840
    .line 841
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v8

    .line 845
    iput-object v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->k:Ljava/lang/Object;

    .line 846
    .line 847
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v8

    .line 851
    iput-object v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->l:Ljava/lang/Object;

    .line 852
    .line 853
    iput v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 854
    .line 855
    const/4 v8, 0x4

    .line 856
    iput v8, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    .line 857
    .line 858
    invoke-virtual {v5, v0, v1, v2}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    if-ne v0, v3, :cond_15

    .line 863
    .line 864
    goto/16 :goto_17

    .line 865
    .line 866
    :cond_15
    move-object v5, v9

    .line 867
    move-object v8, v11

    .line 868
    move-object v9, v13

    .line 869
    move-object v11, v15

    .line 870
    move-object v13, v6

    .line 871
    :goto_15
    move-object v6, v10

    .line 872
    move-object v10, v7

    .line 873
    move-object v7, v14

    .line 874
    move-object v14, v6

    .line 875
    move-object/from16 v22, v11

    .line 876
    .line 877
    move-object v6, v13

    .line 878
    move-object v13, v9

    .line 879
    goto :goto_16

    .line 880
    :cond_16
    invoke-virtual {v14}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    invoke-virtual {v14}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    new-instance v2, Ljava/lang/StringBuilder;

    .line 889
    .line 890
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 891
    .line 892
    .line 893
    const-string v3, "\u9875\u9762 SyncStateOne.kt -> uploadSingleFile\uff0c\u83b7\u53d6\u5c01\u9762 ossToken \u5931\u8d25\uff0c\u6587\u4ef6id="

    .line 894
    .line 895
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 896
    .line 897
    .line 898
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 902
    .line 903
    .line 904
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    new-instance v0, Lcom/friday/common/util/SyncException;

    .line 919
    .line 920
    sget-object v1, Lcom/friday/common/util/SyncException$Kind;->h:Lcom/friday/common/util/SyncException$Kind;

    .line 921
    .line 922
    const-string v2, "\u83b7\u53d6\u5c01\u9762 ossToken \u5931\u8d25"

    .line 923
    .line 924
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    throw v0

    .line 928
    :cond_17
    move-object v5, v9

    .line 929
    :goto_16
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->isOfficeFile()Z

    .line 930
    .line 931
    .line 932
    move-result v0

    .line 933
    if-eqz v0, :cond_19

    .line 934
    .line 935
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    new-instance v1, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;

    .line 940
    .line 941
    const/4 v9, 0x0

    .line 942
    invoke-direct {v1, v5, v9}, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$2;-><init>(Ljava/lang/String;Lvc/c;)V

    .line 943
    .line 944
    .line 945
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v7

    .line 949
    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->c:Ljava/lang/Object;

    .line 950
    .line 951
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v6

    .line 955
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->d:Ljava/lang/Object;

    .line 956
    .line 957
    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v6

    .line 961
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->e:Ljava/lang/Object;

    .line 962
    .line 963
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    move-result-object v6

    .line 967
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->f:Ljava/lang/Object;

    .line 968
    .line 969
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v6

    .line 973
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->g:Ljava/lang/Object;

    .line 974
    .line 975
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object v6

    .line 979
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->h:Ljava/lang/Object;

    .line 980
    .line 981
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    move-result-object v6

    .line 985
    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->i:Ljava/lang/Object;

    .line 986
    .line 987
    iput-object v5, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->j:Ljava/lang/Object;

    .line 988
    .line 989
    const/4 v9, 0x0

    .line 990
    iput-object v9, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->k:Ljava/lang/Object;

    .line 991
    .line 992
    iput-object v9, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->l:Ljava/lang/Object;

    .line 993
    .line 994
    iput v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->m:I

    .line 995
    .line 996
    const/4 v4, 0x5

    .line 997
    iput v4, v2, Lcom/friday/document/sync/SyncStateOne$uploadSingleFile$1;->q:I

    .line 998
    .line 999
    invoke-static {v0, v1, v2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    if-ne v0, v3, :cond_18

    .line 1004
    .line 1005
    :goto_17
    return-object v3

    .line 1006
    :cond_18
    move-object v3, v5

    .line 1007
    :goto_18
    move-object v5, v3

    .line 1008
    :cond_19
    return-object v5

    .line 1009
    :cond_1a
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1020
    .line 1021
    .line 1022
    const-string v3, "\u9875\u9762 SyncStateOne.kt -> uploadSingleFile\uff0c\u83b7\u53d6 ossToken \u5931\u8d25\uff0c\u6587\u4ef6id="

    .line 1023
    .line 1024
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1045
    .line 1046
    .line 1047
    new-instance v0, Lcom/friday/common/util/SyncException;

    .line 1048
    .line 1049
    sget-object v1, Lcom/friday/common/util/SyncException$Kind;->h:Lcom/friday/common/util/SyncException$Kind;

    .line 1050
    .line 1051
    const-string v2, "\u83b7\u53d6 ossToken \u5931\u8d25"

    .line 1052
    .line 1053
    invoke-direct {v0, v1, v2}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    throw v0
.end method

.method public final F(Lcom/friday/common/entity/FileEntity;Ljava/io/File;ILjava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->k:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    .line 38
    .line 39
    const/4 v10, 0x4

    .line 40
    const/4 v11, 0x3

    .line 41
    const/4 v12, 0x2

    .line 42
    const/4 v4, 0x1

    .line 43
    if-eqz v3, :cond_5

    .line 44
    .line 45
    if-eq v3, v4, :cond_4

    .line 46
    .line 47
    if-eq v3, v12, :cond_3

    .line 48
    .line 49
    if-eq v3, v11, :cond_2

    .line 50
    .line 51
    if-ne v3, v10, :cond_1

    .line 52
    .line 53
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 56
    .line 57
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljava/io/File;

    .line 72
    .line 73
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Ljava/io/File;

    .line 76
    .line 77
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 80
    .line 81
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_6

    .line 85
    .line 86
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :cond_2
    iget v3, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->j:I

    .line 95
    .line 96
    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->i:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 99
    .line 100
    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->h:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, Ljava/lang/String;

    .line 103
    .line 104
    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v6, Ljava/lang/String;

    .line 107
    .line 108
    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->f:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v8, Ljava/lang/String;

    .line 111
    .line 112
    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->e:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v9, Ljava/io/File;

    .line 115
    .line 116
    iget-object v11, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->d:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v11, Ljava/io/File;

    .line 119
    .line 120
    iget-object v12, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v12, Lcom/friday/common/entity/FileEntity;

    .line 123
    .line 124
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_4

    .line 128
    .line 129
    :cond_3
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->i:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 132
    .line 133
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->h:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, Ljava/lang/String;

    .line 136
    .line 137
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->g:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, Ljava/lang/String;

    .line 140
    .line 141
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->f:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v2, Ljava/lang/String;

    .line 144
    .line 145
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->e:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, Ljava/io/File;

    .line 148
    .line 149
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->d:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v2, Ljava/io/File;

    .line 152
    .line 153
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 156
    .line 157
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto/16 :goto_3

    .line 161
    .line 162
    :cond_4
    iget v3, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->j:I

    .line 163
    .line 164
    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->h:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Ljava/lang/String;

    .line 167
    .line 168
    iget-object v5, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->g:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v5, Ljava/lang/String;

    .line 171
    .line 172
    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->f:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v6, Ljava/lang/String;

    .line 175
    .line 176
    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->e:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v8, Ljava/io/File;

    .line 179
    .line 180
    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->d:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v9, Ljava/io/File;

    .line 183
    .line 184
    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v13, Lcom/friday/common/entity/FileEntity;

    .line 187
    .line 188
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    move/from16 v18, v3

    .line 192
    .line 193
    move-object/from16 v20, v4

    .line 194
    .line 195
    move-object v15, v5

    .line 196
    move-object/from16 v26, v6

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_5
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual/range {p4 .. p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-static/range {p4 .. p4}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/io/File;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v13

    .line 210
    iget-object v3, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 211
    .line 212
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    move-object/from16 v14, p1

    .line 216
    .line 217
    iput-object v14, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->c:Ljava/lang/Object;

    .line 218
    .line 219
    move-object/from16 v15, p2

    .line 220
    .line 221
    iput-object v15, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->d:Ljava/lang/Object;

    .line 222
    .line 223
    move-object/from16 v5, p4

    .line 224
    .line 225
    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->e:Ljava/lang/Object;

    .line 226
    .line 227
    move-object/from16 v6, p5

    .line 228
    .line 229
    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->f:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->g:Ljava/lang/Object;

    .line 232
    .line 233
    iput-object v13, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->h:Ljava/lang/Object;

    .line 234
    .line 235
    move/from16 v8, p3

    .line 236
    .line 237
    iput v8, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->j:I

    .line 238
    .line 239
    iput v4, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    .line 240
    .line 241
    const-wide/16 v5, 0x0

    .line 242
    .line 243
    const/4 v8, 0x2

    .line 244
    const/4 v9, 0x0

    .line 245
    move-object v4, v1

    .line 246
    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    if-ne v1, v2, :cond_6

    .line 251
    .line 252
    goto/16 :goto_5

    .line 253
    .line 254
    :cond_6
    move/from16 v18, p3

    .line 255
    .line 256
    move-object/from16 v8, p4

    .line 257
    .line 258
    move-object/from16 v26, p5

    .line 259
    .line 260
    move-object/from16 v20, v13

    .line 261
    .line 262
    move-object v13, v14

    .line 263
    move-object v9, v15

    .line 264
    move-object v15, v4

    .line 265
    :goto_2
    move-object v4, v1

    .line 266
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 267
    .line 268
    if-nez v4, :cond_8

    .line 269
    .line 270
    iget-object v1, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 271
    .line 272
    new-instance v14, Lcom/friday/common/entity/ResourceEntity;

    .line 273
    .line 274
    invoke-static {v15}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v13}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v16

    .line 281
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    const-string v5, "getAbsolutePath(...)"

    .line 286
    .line 287
    invoke-static {v3, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Lcom/friday/document/sync/SyncStateOne;->r()J

    .line 294
    .line 295
    .line 296
    move-result-wide v21

    .line 297
    invoke-virtual {v0, v8}, Lcom/friday/document/sync/SyncStateOne;->u(Ljava/io/File;)I

    .line 298
    .line 299
    .line 300
    move-result v23

    .line 301
    const/16 v24, 0x1

    .line 302
    .line 303
    const/16 v25, 0x0

    .line 304
    .line 305
    const-string v19, ""

    .line 306
    .line 307
    move-object/from16 v27, v26

    .line 308
    .line 309
    move-object/from16 v17, v3

    .line 310
    .line 311
    invoke-direct/range {v14 .. v27}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    move/from16 v3, v18

    .line 315
    .line 316
    move-object/from16 v5, v20

    .line 317
    .line 318
    move-object/from16 v6, v26

    .line 319
    .line 320
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v10

    .line 324
    iput-object v10, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->c:Ljava/lang/Object;

    .line 325
    .line 326
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->d:Ljava/lang/Object;

    .line 331
    .line 332
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    iput-object v8, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->e:Ljava/lang/Object;

    .line 337
    .line 338
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->f:Ljava/lang/Object;

    .line 343
    .line 344
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->g:Ljava/lang/Object;

    .line 349
    .line 350
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->h:Ljava/lang/Object;

    .line 355
    .line 356
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->i:Ljava/lang/Object;

    .line 361
    .line 362
    iput v3, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->j:I

    .line 363
    .line 364
    iput v12, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    .line 365
    .line 366
    invoke-interface {v1, v14, v7}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    if-ne v1, v2, :cond_7

    .line 371
    .line 372
    goto/16 :goto_5

    .line 373
    .line 374
    :cond_7
    :goto_3
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 375
    .line 376
    return-object v1

    .line 377
    :cond_8
    move/from16 v3, v18

    .line 378
    .line 379
    move-object/from16 v5, v20

    .line 380
    .line 381
    move-object/from16 v6, v26

    .line 382
    .line 383
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getMd5()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-static {v5, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-nez v1, :cond_b

    .line 392
    .line 393
    iget-object v1, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 394
    .line 395
    invoke-static {v15}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v12

    .line 402
    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->c:Ljava/lang/Object;

    .line 403
    .line 404
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->d:Ljava/lang/Object;

    .line 409
    .line 410
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v12

    .line 414
    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->e:Ljava/lang/Object;

    .line 415
    .line 416
    iput-object v6, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->f:Ljava/lang/Object;

    .line 417
    .line 418
    iput-object v15, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->g:Ljava/lang/Object;

    .line 419
    .line 420
    iput-object v5, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->h:Ljava/lang/Object;

    .line 421
    .line 422
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v12

    .line 426
    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->i:Ljava/lang/Object;

    .line 427
    .line 428
    iput v3, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->j:I

    .line 429
    .line 430
    iput v11, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    .line 431
    .line 432
    invoke-interface {v1, v15, v7}, Lcom/friday/common/dao/ResourceDao;->D(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    if-ne v1, v2, :cond_9

    .line 437
    .line 438
    goto :goto_5

    .line 439
    :cond_9
    move-object v11, v9

    .line 440
    move-object v12, v13

    .line 441
    move-object v9, v8

    .line 442
    move-object v8, v6

    .line 443
    move-object v6, v15

    .line 444
    :goto_4
    iget-object v1, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 445
    .line 446
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v12

    .line 456
    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->c:Ljava/lang/Object;

    .line 457
    .line 458
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v11

    .line 462
    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->d:Ljava/lang/Object;

    .line 463
    .line 464
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v9

    .line 468
    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->e:Ljava/lang/Object;

    .line 469
    .line 470
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v9

    .line 474
    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->f:Ljava/lang/Object;

    .line 475
    .line 476
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v9

    .line 480
    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->g:Ljava/lang/Object;

    .line 481
    .line 482
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v9

    .line 486
    iput-object v9, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->h:Ljava/lang/Object;

    .line 487
    .line 488
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    iput-object v4, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->i:Ljava/lang/Object;

    .line 493
    .line 494
    iput v3, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->j:I

    .line 495
    .line 496
    iput v10, v7, Lcom/friday/document/sync/SyncStateOne$upsertNewNoteResource$1;->m:I

    .line 497
    .line 498
    invoke-interface {v1, v6, v5, v8, v7}, Lcom/friday/common/dao/ResourceDao;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    if-ne v1, v2, :cond_a

    .line 503
    .line 504
    :goto_5
    return-object v2

    .line 505
    :cond_a
    :goto_6
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 506
    .line 507
    return-object v1

    .line 508
    :cond_b
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 509
    .line 510
    return-object v1
.end method

.method public final l(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lcom/friday/document/sync/SyncStateOne$addFile$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/friday/document/sync/SyncStateOne$addFile$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 24
    .line 25
    :goto_0
    move-object v8, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lcom/friday/document/sync/SyncStateOne$addFile$1;

    .line 28
    .line 29
    invoke-direct {v3, v0, v2}, Lcom/friday/document/sync/SyncStateOne$addFile$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->i:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 40
    .line 41
    const-string v5, "\u4e0a\u4f20\u5730\u5740\u4e3a\u7a7a"

    .line 42
    .line 43
    const-string v6, "1"

    .line 44
    .line 45
    const-string v7, "12"

    .line 46
    .line 47
    const-string v11, "\uff0c\u6587\u4ef6\u540d="

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v12, 0x1

    .line 51
    const/4 v13, 0x0

    .line 52
    packed-switch v4, :pswitch_data_0

    .line 53
    .line 54
    .line 55
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :pswitch_0
    iget v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->h:I

    .line 64
    .line 65
    iget-object v3, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Lcom/friday/common/property/BaseResponse;

    .line 68
    .line 69
    iget-object v3, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, Lcom/friday/common/entity/UpdateRequest;

    .line 72
    .line 73
    iget-object v3, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, Ljava/lang/String;

    .line 76
    .line 77
    iget-object v3, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 80
    .line 81
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_17

    .line 85
    .line 86
    :pswitch_1
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->f:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 89
    .line 90
    iget-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v4, Lcom/friday/common/entity/UpdateRequest;

    .line 93
    .line 94
    iget-object v5, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Ljava/lang/String;

    .line 97
    .line 98
    iget-object v6, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v6, Lcom/friday/common/entity/FileEntity;

    .line 101
    .line 102
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_10

    .line 106
    .line 107
    :pswitch_2
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->f:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 110
    .line 111
    iget-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v4, Lcom/friday/common/entity/UpdateRequest;

    .line 114
    .line 115
    iget-object v5, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v5, Ljava/lang/String;

    .line 118
    .line 119
    iget-object v9, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v9, Lcom/friday/common/entity/FileEntity;

    .line 122
    .line 123
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_b

    .line 127
    .line 128
    :pswitch_3
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Lcom/friday/common/entity/UpdateRequest;

    .line 131
    .line 132
    iget-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Ljava/lang/String;

    .line 135
    .line 136
    iget-object v5, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, Lcom/friday/common/entity/FileEntity;

    .line 139
    .line 140
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    move-object v9, v5

    .line 144
    move-object v5, v4

    .line 145
    move-object v4, v1

    .line 146
    goto/16 :goto_a

    .line 147
    .line 148
    :pswitch_4
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, Ljava/lang/String;

    .line 151
    .line 152
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, Ljava/lang/String;

    .line 155
    .line 156
    iget-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 159
    .line 160
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    move-object/from16 v20, v4

    .line 164
    .line 165
    move-object v4, v1

    .line 166
    move-object/from16 v1, v20

    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :pswitch_5
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v1, Ljava/lang/String;

    .line 173
    .line 174
    iget-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 177
    .line 178
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    move-object/from16 v20, v2

    .line 182
    .line 183
    move-object v2, v1

    .line 184
    move-object v1, v4

    .line 185
    move-object/from16 v4, v20

    .line 186
    .line 187
    goto/16 :goto_3

    .line 188
    .line 189
    :pswitch_6
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v1, Ljava/lang/String;

    .line 192
    .line 193
    iget-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 196
    .line 197
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    move-object v2, v1

    .line 201
    move-object v1, v4

    .line 202
    goto/16 :goto_8

    .line 203
    .line 204
    :pswitch_7
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 207
    .line 208
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_7

    .line 212
    .line 213
    :pswitch_8
    iget-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 216
    .line 217
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_6

    .line 221
    .line 222
    :pswitch_9
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    const/16 v10, 0x31

    .line 234
    .line 235
    if-eq v4, v10, :cond_8

    .line 236
    .line 237
    const-string v10, "6"

    .line 238
    .line 239
    const-string v14, "11"

    .line 240
    .line 241
    packed-switch v4, :pswitch_data_1

    .line 242
    .line 243
    .line 244
    packed-switch v4, :pswitch_data_2

    .line 245
    .line 246
    .line 247
    goto/16 :goto_5

    .line 248
    .line 249
    :pswitch_a
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-nez v2, :cond_9

    .line 254
    .line 255
    goto/16 :goto_5

    .line 256
    .line 257
    :pswitch_b
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-nez v2, :cond_1

    .line 262
    .line 263
    goto/16 :goto_5

    .line 264
    .line 265
    :pswitch_c
    const-string v4, "10"

    .line 266
    .line 267
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-nez v2, :cond_1

    .line 272
    .line 273
    goto/16 :goto_5

    .line 274
    .line 275
    :pswitch_d
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-nez v2, :cond_1

    .line 280
    .line 281
    goto/16 :goto_5

    .line 282
    .line 283
    :pswitch_e
    const-string v4, "5"

    .line 284
    .line 285
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v2

    .line 289
    if-nez v2, :cond_1

    .line 290
    .line 291
    goto/16 :goto_5

    .line 292
    .line 293
    :pswitch_f
    const-string v4, "4"

    .line 294
    .line 295
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-nez v2, :cond_1

    .line 300
    .line 301
    goto/16 :goto_5

    .line 302
    .line 303
    :pswitch_10
    const-string v4, "3"

    .line 304
    .line 305
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    if-nez v2, :cond_1

    .line 310
    .line 311
    goto/16 :goto_5

    .line 312
    .line 313
    :cond_1
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-static {v2, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    if-eqz v4, :cond_2

    .line 322
    .line 323
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    goto :goto_2

    .line 328
    :cond_2
    invoke-static {v2, v14}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eqz v2, :cond_3

    .line 333
    .line 334
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getZipFilePath()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    goto :goto_2

    .line 339
    :cond_3
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    :goto_2
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-eqz v4, :cond_7

    .line 348
    .line 349
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 350
    .line 351
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    iput-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 356
    .line 357
    const/4 v4, 0x4

    .line 358
    iput v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 359
    .line 360
    invoke-virtual {v0, v1, v8}, Lcom/friday/document/sync/SyncStateOne;->E(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    if-ne v4, v3, :cond_4

    .line 365
    .line 366
    goto/16 :goto_16

    .line 367
    .line 368
    :cond_4
    :goto_3
    check-cast v4, Ljava/lang/String;

    .line 369
    .line 370
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    if-nez v10, :cond_6

    .line 375
    .line 376
    iget-object v5, v0, Lcom/friday/document/sync/SyncStateOne;->c:Lcom/friday/common/dao/FileDao;

    .line 377
    .line 378
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 383
    .line 384
    iput-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 385
    .line 386
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 391
    .line 392
    const/4 v2, 0x5

    .line 393
    iput v2, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 394
    .line 395
    invoke-interface {v5, v9, v4, v8}, Lcom/friday/common/dao/FileDao;->a(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    if-ne v2, v3, :cond_5

    .line 400
    .line 401
    goto/16 :goto_16

    .line 402
    .line 403
    :cond_5
    :goto_4
    move-object/from16 v17, v4

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :cond_6
    new-instance v1, Lcom/friday/common/util/SyncException;

    .line 407
    .line 408
    invoke-direct {v1, v9, v5, v12, v9}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 409
    .line 410
    .line 411
    throw v1

    .line 412
    :cond_7
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    goto :goto_4

    .line 417
    :cond_8
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    if-nez v2, :cond_9

    .line 422
    .line 423
    :goto_5
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getOssFileUrl()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    goto :goto_4

    .line 428
    :cond_9
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 429
    .line 430
    iput v12, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 431
    .line 432
    invoke-virtual {v0, v1, v8}, Lcom/friday/document/sync/SyncStateOne;->n(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    if-ne v2, v3, :cond_a

    .line 437
    .line 438
    goto/16 :goto_16

    .line 439
    .line 440
    :cond_a
    :goto_6
    check-cast v2, Ljava/lang/Boolean;

    .line 441
    .line 442
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    if-eqz v2, :cond_1e

    .line 447
    .line 448
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 449
    .line 450
    const/4 v2, 0x2

    .line 451
    iput v2, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 452
    .line 453
    invoke-virtual {v0, v1, v8}, Lcom/friday/document/sync/SyncStateOne;->A(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    if-ne v2, v3, :cond_b

    .line 458
    .line 459
    goto/16 :goto_16

    .line 460
    .line 461
    :cond_b
    :goto_7
    check-cast v2, Ljava/lang/String;

    .line 462
    .line 463
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 464
    .line 465
    .line 466
    move-result v4

    .line 467
    if-nez v4, :cond_1d

    .line 468
    .line 469
    iget-object v4, v0, Lcom/friday/document/sync/SyncStateOne;->c:Lcom/friday/common/dao/FileDao;

    .line 470
    .line 471
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 476
    .line 477
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 478
    .line 479
    const/4 v9, 0x3

    .line 480
    iput v9, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 481
    .line 482
    invoke-interface {v4, v5, v2, v8}, Lcom/friday/common/dao/FileDao;->a(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    if-ne v4, v3, :cond_c

    .line 487
    .line 488
    goto/16 :goto_16

    .line 489
    .line 490
    :cond_c
    :goto_8
    move-object/from16 v17, v2

    .line 491
    .line 492
    :goto_9
    new-instance v14, Lcom/friday/common/entity/UpdateRequest;

    .line 493
    .line 494
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v15

    .line 498
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v16

    .line 502
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v18

    .line 506
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v19

    .line 510
    invoke-direct/range {v14 .. v19}, Lcom/friday/common/entity/UpdateRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    iget-object v2, v0, Lcom/friday/document/sync/SyncStateOne;->a:Ls2/a;

    .line 514
    .line 515
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 516
    .line 517
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v4

    .line 521
    iput-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 522
    .line 523
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    iput-object v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 528
    .line 529
    const/4 v4, 0x6

    .line 530
    iput v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 531
    .line 532
    invoke-interface {v2, v14, v8}, Ls2/a;->c(Lcom/friday/common/entity/UpdateRequest;Lvc/c;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    if-ne v2, v3, :cond_d

    .line 537
    .line 538
    goto/16 :goto_16

    .line 539
    .line 540
    :cond_d
    move-object v9, v1

    .line 541
    move-object v4, v14

    .line 542
    move-object/from16 v5, v17

    .line 543
    .line 544
    :goto_a
    move-object v1, v2

    .line 545
    check-cast v1, Lcom/friday/common/property/BaseResponse;

    .line 546
    .line 547
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    if-nez v2, :cond_1c

    .line 552
    .line 553
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    invoke-static {v2, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    if-nez v2, :cond_f

    .line 562
    .line 563
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    invoke-static {v2, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    if-eqz v2, :cond_e

    .line 572
    .line 573
    goto :goto_c

    .line 574
    :cond_e
    :goto_b
    move-object v2, v4

    .line 575
    move-object v14, v5

    .line 576
    move-object v15, v9

    .line 577
    goto :goto_d

    .line 578
    :cond_f
    :goto_c
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v10

    .line 586
    iput-object v9, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 587
    .line 588
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v14

    .line 592
    iput-object v14, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 593
    .line 594
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v14

    .line 598
    iput-object v14, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 599
    .line 600
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->f:Ljava/lang/Object;

    .line 601
    .line 602
    const/4 v14, 0x7

    .line 603
    iput v14, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 604
    .line 605
    invoke-virtual {v0, v2, v10, v8}, Lcom/friday/document/sync/SyncStateOne;->B(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    if-ne v2, v3, :cond_e

    .line 610
    .line 611
    goto/16 :goto_16

    .line 612
    .line 613
    :goto_d
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v4

    .line 617
    invoke-static {v4, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v4

    .line 621
    if-nez v4, :cond_11

    .line 622
    .line 623
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    invoke-static {v4, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v4

    .line 631
    if-eqz v4, :cond_10

    .line 632
    .line 633
    goto :goto_f

    .line 634
    :cond_10
    :goto_e
    move v7, v13

    .line 635
    goto/16 :goto_12

    .line 636
    .line 637
    :cond_11
    :goto_f
    iget-object v4, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 638
    .line 639
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v5

    .line 643
    iput-object v15, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 644
    .line 645
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v6

    .line 649
    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 650
    .line 651
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v6

    .line 655
    iput-object v6, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 656
    .line 657
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->f:Ljava/lang/Object;

    .line 658
    .line 659
    const/16 v6, 0x8

    .line 660
    .line 661
    iput v6, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 662
    .line 663
    const-wide/16 v6, 0x0

    .line 664
    .line 665
    const/4 v9, 0x2

    .line 666
    const/4 v10, 0x0

    .line 667
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v4

    .line 671
    if-ne v4, v3, :cond_12

    .line 672
    .line 673
    goto/16 :goto_16

    .line 674
    .line 675
    :cond_12
    move-object v5, v4

    .line 676
    move-object v4, v2

    .line 677
    move-object v2, v5

    .line 678
    move-object v5, v14

    .line 679
    move-object v6, v15

    .line 680
    :goto_10
    check-cast v2, Ljava/lang/Iterable;

    .line 681
    .line 682
    instance-of v7, v2, Ljava/util/Collection;

    .line 683
    .line 684
    if-eqz v7, :cond_13

    .line 685
    .line 686
    move-object v7, v2

    .line 687
    check-cast v7, Ljava/util/Collection;

    .line 688
    .line 689
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 690
    .line 691
    .line 692
    move-result v7

    .line 693
    if-eqz v7, :cond_13

    .line 694
    .line 695
    move-object v2, v4

    .line 696
    move-object v14, v5

    .line 697
    move-object v15, v6

    .line 698
    goto :goto_e

    .line 699
    :cond_13
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    move v7, v13

    .line 704
    :cond_14
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 705
    .line 706
    .line 707
    move-result v9

    .line 708
    if-eqz v9, :cond_15

    .line 709
    .line 710
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v9

    .line 714
    check-cast v9, Lcom/friday/common/entity/ResourceEntity;

    .line 715
    .line 716
    invoke-virtual {v9}, Lcom/friday/common/entity/ResourceEntity;->getToBeUploaded()Z

    .line 717
    .line 718
    .line 719
    move-result v9

    .line 720
    if-eqz v9, :cond_14

    .line 721
    .line 722
    add-int/lit8 v7, v7, 0x1

    .line 723
    .line 724
    if-gez v7, :cond_14

    .line 725
    .line 726
    invoke-static {}, Lrc/w;->v()V

    .line 727
    .line 728
    .line 729
    goto :goto_11

    .line 730
    :cond_15
    move-object v2, v4

    .line 731
    move-object v14, v5

    .line 732
    move-object v15, v6

    .line 733
    :goto_12
    if-nez v7, :cond_16

    .line 734
    .line 735
    move v4, v12

    .line 736
    goto :goto_13

    .line 737
    :cond_16
    move v4, v13

    .line 738
    :goto_13
    if-lez v7, :cond_19

    .line 739
    .line 740
    iget-object v5, v0, Lcom/friday/document/sync/SyncStateOne;->c:Lcom/friday/common/dao/FileDao;

    .line 741
    .line 742
    move-object v6, v5

    .line 743
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v5

    .line 747
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v9

    .line 751
    if-eqz v9, :cond_17

    .line 752
    .line 753
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v9

    .line 757
    check-cast v9, Lcom/friday/common/entity/UpdateResponse;

    .line 758
    .line 759
    invoke-virtual {v9}, Lcom/friday/common/entity/UpdateResponse;->getVersion()I

    .line 760
    .line 761
    .line 762
    move-result v9

    .line 763
    goto :goto_14

    .line 764
    :cond_17
    move v9, v13

    .line 765
    :goto_14
    iput-object v15, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 766
    .line 767
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v10

    .line 771
    iput-object v10, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 772
    .line 773
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 778
    .line 779
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->f:Ljava/lang/Object;

    .line 784
    .line 785
    iput v7, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->g:I

    .line 786
    .line 787
    iput v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->h:I

    .line 788
    .line 789
    const/16 v1, 0x9

    .line 790
    .line 791
    iput v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 792
    .line 793
    const/4 v7, 0x0

    .line 794
    move v1, v4

    .line 795
    move-object v4, v6

    .line 796
    move v6, v9

    .line 797
    const/4 v9, 0x4

    .line 798
    const/4 v10, 0x0

    .line 799
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/FileDao;->g(Lcom/friday/common/dao/FileDao;Ljava/lang/String;IZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v2

    .line 803
    if-ne v2, v3, :cond_18

    .line 804
    .line 805
    goto :goto_16

    .line 806
    :cond_18
    move-object v3, v15

    .line 807
    goto :goto_17

    .line 808
    :cond_19
    iget-object v5, v0, Lcom/friday/document/sync/SyncStateOne;->c:Lcom/friday/common/dao/FileDao;

    .line 809
    .line 810
    move-object v6, v5

    .line 811
    invoke-virtual {v15}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v5

    .line 815
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v9

    .line 819
    if-eqz v9, :cond_1a

    .line 820
    .line 821
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v9

    .line 825
    check-cast v9, Lcom/friday/common/entity/UpdateResponse;

    .line 826
    .line 827
    invoke-virtual {v9}, Lcom/friday/common/entity/UpdateResponse;->getVersion()I

    .line 828
    .line 829
    .line 830
    move-result v9

    .line 831
    goto :goto_15

    .line 832
    :cond_1a
    move v9, v13

    .line 833
    :goto_15
    iput-object v15, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->c:Ljava/lang/Object;

    .line 834
    .line 835
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v10

    .line 839
    iput-object v10, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->d:Ljava/lang/Object;

    .line 840
    .line 841
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->e:Ljava/lang/Object;

    .line 846
    .line 847
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->f:Ljava/lang/Object;

    .line 852
    .line 853
    iput v7, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->g:I

    .line 854
    .line 855
    iput v4, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->h:I

    .line 856
    .line 857
    const/16 v1, 0xa

    .line 858
    .line 859
    iput v1, v8, Lcom/friday/document/sync/SyncStateOne$addFile$1;->k:I

    .line 860
    .line 861
    const/4 v7, 0x0

    .line 862
    move v1, v4

    .line 863
    move-object v4, v6

    .line 864
    move v6, v9

    .line 865
    const/4 v9, 0x4

    .line 866
    const/4 v10, 0x0

    .line 867
    invoke-static/range {v4 .. v10}, Lcom/friday/common/dao/FileDao;->G(Lcom/friday/common/dao/FileDao;Ljava/lang/String;IZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v2

    .line 871
    if-ne v2, v3, :cond_18

    .line 872
    .line 873
    :goto_16
    return-object v3

    .line 874
    :goto_17
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v3

    .line 882
    if-eqz v1, :cond_1b

    .line 883
    .line 884
    goto :goto_18

    .line 885
    :cond_1b
    move v12, v13

    .line 886
    :goto_18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 887
    .line 888
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 889
    .line 890
    .line 891
    const-string v4, "\u9875\u9762 SyncStateOne.kt -> addFile\uff0c\u540c\u6b65\u5b8c\u6210\uff0c\u6587\u4ef6id="

    .line 892
    .line 893
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 897
    .line 898
    .line 899
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 900
    .line 901
    .line 902
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 903
    .line 904
    .line 905
    const-string v2, "\uff0c\u662f\u5426\u5b8c\u5168\u5b8c\u6210="

    .line 906
    .line 907
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 925
    .line 926
    return-object v1

    .line 927
    :cond_1c
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    .line 936
    .line 937
    .line 938
    move-result-object v4

    .line 939
    new-instance v5, Ljava/lang/StringBuilder;

    .line 940
    .line 941
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 942
    .line 943
    .line 944
    const-string v6, "\u9875\u9762 SyncStateOne.kt -> addFile\uff0cCloudNotes/api/Notes/AddOrUpdate \u8c03\u7528\u5931\u8d25\uff0c\u6587\u4ef6id="

    .line 945
    .line 946
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 947
    .line 948
    .line 949
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 956
    .line 957
    .line 958
    const-string v2, "\uff0cmsg="

    .line 959
    .line 960
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    sget-object v2, Lcom/friday/common/util/SyncException;->e:Lcom/friday/common/util/SyncException$a;

    .line 978
    .line 979
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 980
    .line 981
    .line 982
    move-result v3

    .line 983
    invoke-static {v3}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 984
    .line 985
    .line 986
    move-result-object v3

    .line 987
    invoke-virtual {v1}, Lcom/friday/common/property/BaseResponse;->getMsg()Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    invoke-virtual {v2, v3, v1}, Lcom/friday/common/util/SyncException$a;->c(Ljava/lang/Integer;Ljava/lang/String;)Lcom/friday/common/util/SyncException;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    throw v1

    .line 996
    :cond_1d
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v2

    .line 1000
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v1

    .line 1004
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1007
    .line 1008
    .line 1009
    const-string v4, "\u9875\u9762 SyncStateOne.kt -> addFile\uff0c\u4e0a\u4f20\u5730\u5740\u4e3a\u7a7a\uff0c\u6587\u4ef6id="

    .line 1010
    .line 1011
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v1

    .line 1031
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1032
    .line 1033
    .line 1034
    new-instance v1, Lcom/friday/common/util/SyncException;

    .line 1035
    .line 1036
    invoke-direct {v1, v9, v5, v12, v9}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 1037
    .line 1038
    .line 1039
    throw v1

    .line 1040
    :cond_1e
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v2

    .line 1044
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1049
    .line 1050
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1051
    .line 1052
    .line 1053
    const-string v4, "\u9875\u9762 SyncStateOne.kt -> addFile\uff0c\u672c\u5730\u6587\u4ef6\u4e0d\u5b58\u5728\uff0c\u8df3\u8fc7 CloudNotes/api/Notes/AddOrUpdate\uff0c\u6587\u4ef6id="

    .line 1054
    .line 1055
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v1

    .line 1075
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1076
    .line 1077
    .line 1078
    new-instance v1, Lcom/friday/common/util/SyncException;

    .line 1079
    .line 1080
    sget-object v2, Lcom/friday/common/util/SyncException$Kind;->d:Lcom/friday/common/util/SyncException$Kind;

    .line 1081
    .line 1082
    const-string v3, "\u672c\u5730\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 1083
    .line 1084
    invoke-direct {v1, v2, v3}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    throw v1

    .line 1088
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x33
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61f
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public final m(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->h:I

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
    iput v1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->h:I

    .line 32
    .line 33
    const-string v3, "\uff0c\u8d44\u6e90id="

    .line 34
    .line 35
    const/4 v4, 0x3

    .line 36
    const/4 v5, 0x2

    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-eq v2, v6, :cond_3

    .line 42
    .line 43
    if-eq v2, v5, :cond_2

    .line 44
    .line 45
    if-ne v2, v4, :cond_1

    .line 46
    .line 47
    iget-object p1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->d:Ljava/lang/Object;

    .line 48
    .line 49
    move-object p2, p1

    .line 50
    check-cast p2, Lcom/friday/common/entity/ResourceEntity;

    .line 51
    .line 52
    iget-object p1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 55
    .line 56
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    iget-object p1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p1, Lcom/friday/common/entity/ResourceEntity;

    .line 72
    .line 73
    iget-object p1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 76
    .line 77
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-object p3

    .line 81
    :cond_3
    iget-object p1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->d:Ljava/lang/Object;

    .line 82
    .line 83
    move-object p2, p1

    .line 84
    check-cast p2, Lcom/friday/common/entity/ResourceEntity;

    .line 85
    .line 86
    iget-object p1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 89
    .line 90
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    const/4 v8, 0x0

    .line 106
    invoke-static {p3, v2, v7, v5, v8}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p3

    .line 110
    if-eqz p3, :cond_5

    .line 111
    .line 112
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-static {p3, v2, v7, v5, v8}, Lqd/z;->O(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    if-eqz p3, :cond_5

    .line 125
    .line 126
    move p3, v6

    .line 127
    goto :goto_1

    .line 128
    :cond_5
    move p3, v7

    .line 129
    :goto_1
    if-nez p3, :cond_7

    .line 130
    .line 131
    iget-object v2, p0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 132
    .line 133
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    iput-object p1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->c:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object p2, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->d:Ljava/lang/Object;

    .line 140
    .line 141
    iput p3, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->e:I

    .line 142
    .line 143
    iput v6, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->h:I

    .line 144
    .line 145
    invoke-interface {v2, v4, v0}, Lcom/friday/common/dao/ResourceDao;->H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    if-ne p3, v1, :cond_6

    .line 150
    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    new-instance v1, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v2, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u8d44\u6e90\u8def\u5f84\u4e0d\u5c5e\u4e8e\u5f53\u524d\u7b14\u8bb0\uff0c\u8df3\u8fc7\u4e0a\u4f20\uff0c\u6587\u4ef6id="

    .line 175
    .line 176
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p3, "\uff0c\u672c\u5730\u76ee\u5f55="

    .line 183
    .line 184
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string p1, "\uff0cpageName="

    .line 197
    .line 198
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v7}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    return-object p1

    .line 220
    :cond_7
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-nez v2, :cond_b

    .line 229
    .line 230
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-lez v2, :cond_9

    .line 239
    .line 240
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    iput-object v2, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->c:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    iput-object v2, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->d:Ljava/lang/Object;

    .line 251
    .line 252
    iput p3, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->e:I

    .line 253
    .line 254
    iput v5, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->h:I

    .line 255
    .line 256
    invoke-virtual {p0, p1, p2, v0}, Lcom/friday/document/sync/SyncStateOne;->w(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    if-ne p1, v1, :cond_8

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_8
    return-object p1

    .line 264
    :cond_9
    iget-object v2, p0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 265
    .line 266
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    iput-object p1, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->c:Ljava/lang/Object;

    .line 271
    .line 272
    iput-object p2, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->d:Ljava/lang/Object;

    .line 273
    .line 274
    iput p3, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->e:I

    .line 275
    .line 276
    iput v4, v0, Lcom/friday/document/sync/SyncStateOne$checkResourceCanUpload$1;->h:I

    .line 277
    .line 278
    invoke-interface {v2, v5, v0}, Lcom/friday/common/dao/ResourceDao;->H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p3

    .line 282
    if-ne p3, v1, :cond_a

    .line 283
    .line 284
    :goto_3
    return-object v1

    .line 285
    :cond_a
    :goto_4
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p3

    .line 293
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    const-string v1, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u8d44\u6e90\u6587\u4ef6\u4e0d\u5b58\u5728\uff0c\u8df3\u8fc7\u4e0a\u4f20\uff0c\u6587\u4ef6id="

    .line 303
    .line 304
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string p1, "\uff0c\u5df2\u6709oss="

    .line 317
    .line 318
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v7}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    return-object p1

    .line 340
    :cond_b
    invoke-static {v6}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    return-object p1
.end method

.method public final n(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->g:I

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
    iput v1, v0, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->g:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->g:I

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    const/4 v2, 0x2

    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-eq v1, v3, :cond_3

    .line 41
    .line 42
    if-eq v1, v2, :cond_2

    .line 43
    .line 44
    if-ne v1, v8, :cond_1

    .line 45
    .line 46
    iget-object p1, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/util/List;

    .line 49
    .line 50
    iget-object p1, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 53
    .line 54
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_2
    iget-object p1, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 70
    .line 71
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object p1, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->c:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 78
    .line 79
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object p2

    .line 83
    :cond_4
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    const-string v1, "12"

    .line 91
    .line 92
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_6

    .line 97
    .line 98
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    iput-object p2, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->c:Ljava/lang/Object;

    .line 103
    .line 104
    iput v3, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->g:I

    .line 105
    .line 106
    invoke-virtual {p0, p1, v5}, Lcom/friday/document/sync/SyncStateOne;->v(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v0, :cond_5

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    return-object p1

    .line 114
    :cond_6
    iget-object v1, p0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 115
    .line 116
    move p2, v2

    .line 117
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iput-object p1, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->c:Ljava/lang/Object;

    .line 122
    .line 123
    iput p2, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->g:I

    .line 124
    .line 125
    const-wide/16 v3, 0x0

    .line 126
    .line 127
    const/4 v6, 0x2

    .line 128
    const/4 v7, 0x0

    .line 129
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    if-ne p2, v0, :cond_7

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 137
    .line 138
    move-object v1, p2

    .line 139
    check-cast v1, Ljava/util/Collection;

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_a

    .line 146
    .line 147
    iget-object v1, p0, Lcom/friday/document/sync/SyncStateOne;->c:Lcom/friday/common/dao/FileDao;

    .line 148
    .line 149
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-object p1, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->c:Ljava/lang/Object;

    .line 158
    .line 159
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iput-object p1, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->d:Ljava/lang/Object;

    .line 164
    .line 165
    iput v8, v5, Lcom/friday/document/sync/SyncStateOne$doesFileExits$1;->g:I

    .line 166
    .line 167
    invoke-interface {v1, v2, v5}, Lcom/friday/common/dao/FileDao;->Y(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    if-ne p2, v0, :cond_8

    .line 172
    .line 173
    :goto_3
    return-object v0

    .line 174
    :cond_8
    :goto_4
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 175
    .line 176
    if-eqz p2, :cond_9

    .line 177
    .line 178
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    goto :goto_5

    .line 183
    :cond_9
    const/4 p1, 0x0

    .line 184
    goto :goto_5

    .line 185
    :cond_a
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 190
    .line 191
    new-instance v0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string p1, "index.json"

    .line 203
    .line 204
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    :goto_5
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    return-object p1
.end method

.method public final o(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lcom/friday/document/sync/SyncStateOne$doesObjectExist$2;-><init>(Ljava/lang/String;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final p(Ljava/io/File;)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lf2/e;->a:Lf2/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf2/e;->c(Ljava/io/File;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final q(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "index.json"

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Ljava/io/File;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-static {v0, p1, v1, p1}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Lcom/friday/document/sync/SyncStateOne$a;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/friday/document/sync/SyncStateOne$a;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lcom/google/gson/Gson;

    .line 44
    .line 45
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string v0, "fromJson(...)"

    .line 53
    .line 54
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast p1, Ljava/util/ArrayList;

    .line 58
    .line 59
    return-object p1
.end method

.method public final r()J
    .locals 2

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
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public final s(Ljava/io/File;Ljava/io/File;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "snapshot.bin"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v0, v1, v2}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "screenshot.png"

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "getAbsolutePath(...)"

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, p2}, Lqd/c0;->y0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v0, "getFileExtension(...)"

    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 61
    .line 62
    const-string v1, "ROOT"

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const-string v0, "toLowerCase(...)"

    .line 72
    .line 73
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v3, "res"

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const/4 v1, 0x2

    .line 99
    const/4 v3, 0x0

    .line 100
    const/4 v4, 0x0

    .line 101
    invoke-static {p2, v0, v4, v1, v3}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_2

    .line 106
    .line 107
    const-string p2, "jpg"

    .line 108
    .line 109
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-nez p2, :cond_1

    .line 114
    .line 115
    const-string p2, "png"

    .line 116
    .line 117
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-nez p2, :cond_1

    .line 122
    .line 123
    const-string p2, "webp"

    .line 124
    .line 125
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_2

    .line 130
    .line 131
    :cond_1
    return v2

    .line 132
    :cond_2
    return v4

    .line 133
    :cond_3
    :goto_0
    return v2
.end method

.method public final t()Z
    .locals 1

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
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final u(Ljava/io/File;)I
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "screenshot.png"

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-static {v0, v1, v2}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "snapshot.bin"

    .line 21
    .line 22
    invoke-static {p1, v0, v2}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    return v2

    .line 29
    :cond_1
    const/4 p1, 0x0

    .line 30
    return p1
.end method

.method public final v(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/sync/SyncStateOne$prepareNewNoteForSync$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final w(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v0, p3

    .line 8
    .line 9
    instance-of v4, v0, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;

    .line 15
    .line 16
    iget v5, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->h:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->h:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;

    .line 29
    .line 30
    invoke-direct {v4, v1, v0}, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v0, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->f:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    iget v6, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->h:I

    .line 40
    .line 41
    const/4 v8, 0x2

    .line 42
    const/4 v9, 0x1

    .line 43
    const-string v10, "\uff0c\u8d44\u6e90id="

    .line 44
    .line 45
    if-eqz v6, :cond_3

    .line 46
    .line 47
    if-eq v6, v9, :cond_2

    .line 48
    .line 49
    if-ne v6, v8, :cond_1

    .line 50
    .line 51
    iget-object v2, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 54
    .line 55
    iget-object v3, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 p3, v3

    .line 63
    .line 64
    move-object v3, v2

    .line 65
    move-object/from16 v2, p3

    .line 66
    .line 67
    const/16 p3, 0x0

    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v0

    .line 79
    :cond_2
    iget-object v2, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 82
    .line 83
    iget-object v3, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    move-object/from16 p3, v3

    .line 91
    .line 92
    move-object v3, v2

    .line 93
    move-object/from16 v2, p3

    .line 94
    .line 95
    const/16 p3, 0x0

    .line 96
    .line 97
    goto/16 :goto_3

    .line 98
    .line 99
    :cond_3
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    new-instance v12, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    const-string v13, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u8d44\u6e90\u6587\u4ef6\u4e0d\u5b58\u5728\u4f46\u5df2\u6709 OSS\uff0c\u5f00\u59cb\u5c1d\u8bd5\u8865\u56de\u672c\u5730\uff0c\u6587\u4ef6id="

    .line 120
    .line 121
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v6, "\uff0coss="

    .line 134
    .line 135
    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :try_start_0
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 153
    .line 154
    sget-object v0, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    .line 157
    .line 158
    .line 159
    move-result-object v11

    .line 160
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    const/4 v15, 0x4

    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    const/4 v14, 0x0

    .line 172
    invoke-static/range {v11 .. v16}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    goto :goto_1

    .line 192
    :catchall_0
    move-exception v0

    .line 193
    sget-object v11, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 194
    .line 195
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    :goto_1
    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 204
    .line 205
    .line 206
    move-result-object v11

    .line 207
    if-eqz v11, :cond_4

    .line 208
    .line 209
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v14

    .line 221
    invoke-virtual {v11}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v11

    .line 225
    new-instance v15, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    const/16 p3, 0x0

    .line 231
    .line 232
    const-string v7, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u4ece OSS \u8865\u56de\u672c\u5730\u8d44\u6e90\u5931\u8d25\uff0c\u6587\u4ef6id="

    .line 233
    .line 234
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v6, "\uff0c\u5f02\u5e38="

    .line 253
    .line 254
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_4
    const/16 p3, 0x0

    .line 273
    .line 274
    :goto_2
    invoke-static/range {p3 .. p3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    if-eqz v7, :cond_5

    .line 283
    .line 284
    move-object v0, v6

    .line 285
    :cond_5
    check-cast v0, Ljava/lang/Boolean;

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_7

    .line 292
    .line 293
    iget-object v6, v1, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 294
    .line 295
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    iput-object v2, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->c:Ljava/lang/Object;

    .line 300
    .line 301
    iput-object v3, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->d:Ljava/lang/Object;

    .line 302
    .line 303
    iput-boolean v0, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->e:Z

    .line 304
    .line 305
    iput v9, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->h:I

    .line 306
    .line 307
    invoke-interface {v6, v7, v4}, Lcom/friday/common/dao/ResourceDao;->H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-ne v0, v5, :cond_6

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_6
    :goto_3
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    new-instance v3, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const-string v4, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u4ece OSS \u8865\u56de\u672c\u5730\u8d44\u6e90\u6210\u529f\uff0c\u8df3\u8fc7\u91cd\u590d\u4e0a\u4f20\u5e76\u7b49\u5f85\u5199\u540e\u7aef\u8d44\u6e90\u63a5\u53e3\uff0c\u6587\u4ef6id="

    .line 328
    .line 329
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_7
    iget-object v6, v1, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 354
    .line 355
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    iput-object v2, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->c:Ljava/lang/Object;

    .line 360
    .line 361
    iput-object v3, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->d:Ljava/lang/Object;

    .line 362
    .line 363
    iput-boolean v0, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->e:Z

    .line 364
    .line 365
    iput v8, v4, Lcom/friday/document/sync/SyncStateOne$restoreMissingResourceFromOss$1;->h:I

    .line 366
    .line 367
    invoke-interface {v6, v7, v4}, Lcom/friday/common/dao/ResourceDao;->H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    if-ne v0, v5, :cond_8

    .line 372
    .line 373
    :goto_4
    return-object v5

    .line 374
    :cond_8
    :goto_5
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    new-instance v3, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 385
    .line 386
    .line 387
    const-string v4, "\u9875\u9762 SyncStateOne.kt -> uploadFile\uff0c\u4ece OSS \u8865\u56de\u672c\u5730\u8d44\u6e90\u5931\u8d25\uff0c\u4ecd\u4fdd\u7559\u5df2\u6709 OSS \u5730\u5740\u7528\u4e8e\u5199\u540e\u7aef\u8d44\u6e90\u63a5\u53e3\uff0c\u6587\u4ef6id="

    .line 388
    .line 389
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    :goto_6
    invoke-static/range {p3 .. p3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    return-object v0
.end method

.method public final x(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    const-string v2, "_deleted"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {p1, v2, v3, v0, v1}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final y(Lcom/friday/common/entity/FileEntity;Ljava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->x:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->x:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->v:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->x:I

    .line 38
    .line 39
    const/4 v11, 0x3

    .line 40
    const/4 v12, 0x2

    .line 41
    const/4 v14, 0x1

    .line 42
    if-eqz v2, :cond_4

    .line 43
    .line 44
    if-eq v2, v14, :cond_3

    .line 45
    .line 46
    if-eq v2, v12, :cond_2

    .line 47
    .line 48
    if-ne v2, v11, :cond_1

    .line 49
    .line 50
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lkotlin/jvm/internal/Ref$IntRef;

    .line 53
    .line 54
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ljava/util/Map;

    .line 57
    .line 58
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/util/List;

    .line 61
    .line 62
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Ljava/io/File;

    .line 69
    .line 70
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 73
    .line 74
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_d

    .line 78
    .line 79
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1

    .line 87
    :cond_2
    iget v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->u:I

    .line 88
    .line 89
    iget v3, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->s:I

    .line 90
    .line 91
    iget v4, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->r:I

    .line 92
    .line 93
    iget v5, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->q:I

    .line 94
    .line 95
    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->p:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v6, Ljava/io/File;

    .line 98
    .line 99
    iget-object v6, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v6, Ljava/util/Iterator;

    .line 102
    .line 103
    iget-object v8, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->m:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v8, Ljava/lang/Iterable;

    .line 106
    .line 107
    iget-object v9, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->l:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v9, Ljava/io/File;

    .line 110
    .line 111
    iget-object v15, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->k:Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v11, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->j:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v11, Ljava/util/Iterator;

    .line 116
    .line 117
    iget-object v12, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->i:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v12, Ljava/lang/Iterable;

    .line 120
    .line 121
    iget-object v13, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->h:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v13, Lkotlin/jvm/internal/Ref$IntRef;

    .line 124
    .line 125
    iget-object v14, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->g:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v14, Ljava/util/Map;

    .line 128
    .line 129
    move-object/from16 v19, v1

    .line 130
    .line 131
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->f:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Ljava/util/List;

    .line 134
    .line 135
    move-object/from16 p1, v1

    .line 136
    .line 137
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->e:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, Ljava/lang/String;

    .line 140
    .line 141
    move-object/from16 p2, v1

    .line 142
    .line 143
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->d:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Ljava/io/File;

    .line 146
    .line 147
    move-object/from16 p3, v1

    .line 148
    .line 149
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->c:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 152
    .line 153
    invoke-static/range {v19 .. v19}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    move-object/from16 v20, p3

    .line 157
    .line 158
    move-object/from16 v19, v8

    .line 159
    .line 160
    move-object/from16 v16, v11

    .line 161
    .line 162
    move-object v11, v13

    .line 163
    move-object/from16 v21, v15

    .line 164
    .line 165
    const/16 v17, 0x0

    .line 166
    .line 167
    move v13, v4

    .line 168
    move-object v15, v6

    .line 169
    move-object v6, v7

    .line 170
    move-object v4, v9

    .line 171
    const/4 v7, 0x2

    .line 172
    move v9, v3

    .line 173
    move v3, v2

    .line 174
    move v2, v5

    .line 175
    move-object/from16 v5, p2

    .line 176
    .line 177
    :goto_2
    move-object/from16 v8, p1

    .line 178
    .line 179
    goto/16 :goto_b

    .line 180
    .line 181
    :cond_3
    move-object/from16 v19, v1

    .line 182
    .line 183
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->f:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v1, Lcom/friday/common/helper/NotePageOrder;

    .line 186
    .line 187
    iget-object v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->e:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v2, Ljava/lang/String;

    .line 190
    .line 191
    iget-object v3, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->d:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v3, Ljava/io/File;

    .line 194
    .line 195
    iget-object v4, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->c:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 198
    .line 199
    invoke-static/range {v19 .. v19}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    move-object v12, v2

    .line 203
    move-object v11, v3

    .line 204
    move-object v2, v4

    .line 205
    goto :goto_3

    .line 206
    :cond_4
    move-object/from16 v19, v1

    .line 207
    .line 208
    invoke-static/range {v19 .. v19}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    sget-object v1, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 212
    .line 213
    iget-object v3, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 214
    .line 215
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    move-object/from16 v2, p1

    .line 220
    .line 221
    iput-object v2, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->c:Ljava/lang/Object;

    .line 222
    .line 223
    move-object/from16 v11, p2

    .line 224
    .line 225
    iput-object v11, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->d:Ljava/lang/Object;

    .line 226
    .line 227
    move-object/from16 v12, p3

    .line 228
    .line 229
    iput-object v12, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->e:Ljava/lang/Object;

    .line 230
    .line 231
    iput-object v1, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->f:Ljava/lang/Object;

    .line 232
    .line 233
    const/4 v5, 0x1

    .line 234
    iput v5, v7, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->x:I

    .line 235
    .line 236
    const-wide/16 v5, 0x0

    .line 237
    .line 238
    const/4 v8, 0x2

    .line 239
    const/4 v9, 0x0

    .line 240
    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    if-ne v3, v10, :cond_5

    .line 245
    .line 246
    goto/16 :goto_c

    .line 247
    .line 248
    :cond_5
    move-object/from16 v19, v3

    .line 249
    .line 250
    :goto_3
    move-object/from16 v3, v19

    .line 251
    .line 252
    check-cast v3, Ljava/util/List;

    .line 253
    .line 254
    invoke-virtual {v1, v3}, Lcom/friday/common/helper/NotePageOrder;->b(Ljava/util/List;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    move-object v3, v1

    .line 259
    check-cast v3, Ljava/lang/Iterable;

    .line 260
    .line 261
    const/16 v4, 0xa

    .line 262
    .line 263
    invoke-static {v3, v4}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    invoke-static {v4}, Lrc/q0;->e(I)I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    const/16 v5, 0x10

    .line 272
    .line 273
    invoke-static {v4, v5}, Lnd/o;->e(II)I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 278
    .line 279
    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-eqz v4, :cond_6

    .line 291
    .line 292
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 297
    .line 298
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getPageIndex()I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-static {v4}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-static {v6, v4}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-virtual {v4}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    invoke-virtual {v4}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    goto :goto_4

    .line 326
    :cond_6
    invoke-static {v5}, Lkotlin/collections/a;->x(Ljava/util/Map;)Ljava/util/Map;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    new-instance v4, Lkotlin/jvm/internal/Ref$IntRef;

    .line 331
    .line 332
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    check-cast v5, Ljava/lang/Iterable;

    .line 340
    .line 341
    invoke-static {v5}, Lrc/g0;->A0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    check-cast v5, Ljava/lang/Integer;

    .line 346
    .line 347
    if-eqz v5, :cond_7

    .line 348
    .line 349
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    :goto_5
    const/16 v18, 0x1

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_7
    const/4 v5, -0x1

    .line 357
    goto :goto_5

    .line 358
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 359
    .line 360
    iput v5, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 361
    .line 362
    invoke-virtual {v0, v11}, Lcom/friday/document/sync/SyncStateOne;->p(Ljava/io/File;)Ljava/util/List;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    check-cast v5, Ljava/lang/Iterable;

    .line 367
    .line 368
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    move-object v8, v5

    .line 373
    move-object v5, v3

    .line 374
    move-object v3, v8

    .line 375
    move-object v8, v7

    .line 376
    const/4 v7, 0x0

    .line 377
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v9

    .line 381
    if-eqz v9, :cond_d

    .line 382
    .line 383
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    move-object v13, v9

    .line 388
    check-cast v13, Ljava/io/File;

    .line 389
    .line 390
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v14

    .line 394
    invoke-interface {v5, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v15

    .line 398
    if-nez v15, :cond_8

    .line 399
    .line 400
    iget v15, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 401
    .line 402
    move-object/from16 p1, v1

    .line 403
    .line 404
    add-int/lit8 v1, v15, 0x1

    .line 405
    .line 406
    iput v1, v4, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 407
    .line 408
    invoke-static {v15}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 409
    .line 410
    .line 411
    move-result-object v15

    .line 412
    invoke-interface {v5, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    goto :goto_8

    .line 416
    :cond_8
    move-object/from16 p1, v1

    .line 417
    .line 418
    :goto_8
    check-cast v15, Ljava/lang/Number;

    .line 419
    .line 420
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    const/4 v14, 0x1

    .line 425
    invoke-static {v13, v14}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;Z)Ljava/util/List;

    .line 426
    .line 427
    .line 428
    move-result-object v15

    .line 429
    const-string v14, "listFilesInDir(...)"

    .line 430
    .line 431
    invoke-static {v15, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    check-cast v15, Ljava/lang/Iterable;

    .line 435
    .line 436
    new-instance v14, Ljava/util/ArrayList;

    .line 437
    .line 438
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 439
    .line 440
    .line 441
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 442
    .line 443
    .line 444
    move-result-object v15

    .line 445
    :goto_9
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v19

    .line 449
    if-eqz v19, :cond_a

    .line 450
    .line 451
    move/from16 p2, v1

    .line 452
    .line 453
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    move-object/from16 p3, v2

    .line 458
    .line 459
    move-object v2, v1

    .line 460
    check-cast v2, Ljava/io/File;

    .line 461
    .line 462
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 463
    .line 464
    .line 465
    move-result v19

    .line 466
    if-eqz v19, :cond_9

    .line 467
    .line 468
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0, v2, v13}, Lcom/friday/document/sync/SyncStateOne;->s(Ljava/io/File;Ljava/io/File;)Z

    .line 472
    .line 473
    .line 474
    move-result v2

    .line 475
    if-eqz v2, :cond_9

    .line 476
    .line 477
    invoke-interface {v14, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    :cond_9
    move/from16 v1, p2

    .line 481
    .line 482
    move-object/from16 v2, p3

    .line 483
    .line 484
    goto :goto_9

    .line 485
    :cond_a
    move/from16 p2, v1

    .line 486
    .line 487
    move-object/from16 p3, v2

    .line 488
    .line 489
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    move-object v15, v6

    .line 494
    move v2, v7

    .line 495
    move-object v6, v8

    .line 496
    move-object/from16 v21, v9

    .line 497
    .line 498
    move-object/from16 v20, v11

    .line 499
    .line 500
    move-object/from16 v19, v14

    .line 501
    .line 502
    const/4 v9, 0x0

    .line 503
    move-object/from16 v7, p1

    .line 504
    .line 505
    move-object v14, v1

    .line 506
    move-object v8, v3

    .line 507
    move-object v11, v4

    .line 508
    move-object v4, v13

    .line 509
    move/from16 v3, p2

    .line 510
    .line 511
    move-object/from16 v1, p3

    .line 512
    .line 513
    move-object v13, v5

    .line 514
    move-object v5, v12

    .line 515
    const/4 v12, 0x0

    .line 516
    :goto_a
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v22

    .line 520
    if-eqz v22, :cond_c

    .line 521
    .line 522
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v22

    .line 526
    move-object/from16 v23, v22

    .line 527
    .line 528
    check-cast v23, Ljava/io/File;

    .line 529
    .line 530
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    iput-object v1, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->c:Ljava/lang/Object;

    .line 534
    .line 535
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->d:Ljava/lang/Object;

    .line 540
    .line 541
    iput-object v5, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->e:Ljava/lang/Object;

    .line 542
    .line 543
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->f:Ljava/lang/Object;

    .line 548
    .line 549
    iput-object v13, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->g:Ljava/lang/Object;

    .line 550
    .line 551
    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->h:Ljava/lang/Object;

    .line 552
    .line 553
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->i:Ljava/lang/Object;

    .line 558
    .line 559
    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->j:Ljava/lang/Object;

    .line 560
    .line 561
    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->k:Ljava/lang/Object;

    .line 566
    .line 567
    iput-object v4, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->l:Ljava/lang/Object;

    .line 568
    .line 569
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->m:Ljava/lang/Object;

    .line 574
    .line 575
    iput-object v14, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->n:Ljava/lang/Object;

    .line 576
    .line 577
    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->o:Ljava/lang/Object;

    .line 582
    .line 583
    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->p:Ljava/lang/Object;

    .line 588
    .line 589
    iput v2, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->q:I

    .line 590
    .line 591
    iput v12, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->r:I

    .line 592
    .line 593
    iput v9, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->s:I

    .line 594
    .line 595
    const/4 v0, 0x0

    .line 596
    iput v0, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->t:I

    .line 597
    .line 598
    iput v3, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->u:I

    .line 599
    .line 600
    move-object/from16 p1, v7

    .line 601
    .line 602
    const/4 v7, 0x2

    .line 603
    iput v7, v6, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->x:I

    .line 604
    .line 605
    move/from16 v17, v0

    .line 606
    .line 607
    move/from16 v16, v2

    .line 608
    .line 609
    move-object v2, v4

    .line 610
    move-object/from16 v4, v23

    .line 611
    .line 612
    move-object/from16 v0, p0

    .line 613
    .line 614
    invoke-virtual/range {v0 .. v6}, Lcom/friday/document/sync/SyncStateOne;->F(Lcom/friday/common/entity/FileEntity;Ljava/io/File;ILjava/io/File;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    if-ne v4, v10, :cond_b

    .line 619
    .line 620
    goto/16 :goto_c

    .line 621
    .line 622
    :cond_b
    move-object v4, v2

    .line 623
    move/from16 v2, v16

    .line 624
    .line 625
    move-object/from16 v16, v15

    .line 626
    .line 627
    move-object v15, v14

    .line 628
    move-object v14, v13

    .line 629
    move v13, v12

    .line 630
    move-object v12, v8

    .line 631
    goto/16 :goto_2

    .line 632
    .line 633
    :goto_b
    move-object v7, v8

    .line 634
    move-object v8, v12

    .line 635
    move v12, v13

    .line 636
    move-object v13, v14

    .line 637
    move-object v14, v15

    .line 638
    move-object/from16 v15, v16

    .line 639
    .line 640
    goto :goto_a

    .line 641
    :cond_c
    move/from16 v16, v2

    .line 642
    .line 643
    move-object/from16 p1, v7

    .line 644
    .line 645
    const/4 v7, 0x2

    .line 646
    const/16 v17, 0x0

    .line 647
    .line 648
    move-object v2, v1

    .line 649
    move-object v12, v5

    .line 650
    move-object v3, v8

    .line 651
    move-object v4, v11

    .line 652
    move-object v5, v13

    .line 653
    move/from16 v7, v16

    .line 654
    .line 655
    move-object/from16 v11, v20

    .line 656
    .line 657
    move-object/from16 v1, p1

    .line 658
    .line 659
    move-object v8, v6

    .line 660
    move-object v6, v15

    .line 661
    goto/16 :goto_7

    .line 662
    .line 663
    :cond_d
    move-object/from16 p1, v1

    .line 664
    .line 665
    move-object/from16 p3, v2

    .line 666
    .line 667
    iget-object v3, v0, Lcom/friday/document/sync/SyncStateOne;->d:Lcom/friday/common/dao/ResourceDao;

    .line 668
    .line 669
    move-object v1, v4

    .line 670
    invoke-virtual/range {p3 .. p3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    invoke-virtual {v0}, Lcom/friday/document/sync/SyncStateOne;->r()J

    .line 675
    .line 676
    .line 677
    move-result-wide v6

    .line 678
    invoke-static/range {p3 .. p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v2

    .line 682
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->c:Ljava/lang/Object;

    .line 683
    .line 684
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->d:Ljava/lang/Object;

    .line 689
    .line 690
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->e:Ljava/lang/Object;

    .line 695
    .line 696
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->f:Ljava/lang/Object;

    .line 701
    .line 702
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    iput-object v2, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->g:Ljava/lang/Object;

    .line 707
    .line 708
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v1

    .line 712
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->h:Ljava/lang/Object;

    .line 713
    .line 714
    const/4 v1, 0x0

    .line 715
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->i:Ljava/lang/Object;

    .line 716
    .line 717
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->j:Ljava/lang/Object;

    .line 718
    .line 719
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->k:Ljava/lang/Object;

    .line 720
    .line 721
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->l:Ljava/lang/Object;

    .line 722
    .line 723
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->m:Ljava/lang/Object;

    .line 724
    .line 725
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->n:Ljava/lang/Object;

    .line 726
    .line 727
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->o:Ljava/lang/Object;

    .line 728
    .line 729
    iput-object v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->p:Ljava/lang/Object;

    .line 730
    .line 731
    const/4 v1, 0x3

    .line 732
    iput v1, v8, Lcom/friday/document/sync/SyncStateOne$syncNewNoteResource$1;->x:I

    .line 733
    .line 734
    invoke-interface/range {v3 .. v8}, Lcom/friday/common/dao/ResourceDao;->o(Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    if-ne v1, v10, :cond_e

    .line 739
    .line 740
    :goto_c
    return-object v10

    .line 741
    :cond_e
    :goto_d
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 742
    .line 743
    return-object v1
.end method

.method public final z(Lcom/friday/common/helper/OssUploadHelper;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Lvc/c;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v0, p5

    instance-of v2, v0, Lcom/friday/document/sync/SyncStateOne$upload$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/friday/document/sync/SyncStateOne$upload$1;

    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/friday/document/sync/SyncStateOne$upload$1;

    invoke-direct {v2, v1, v0}, Lcom/friday/document/sync/SyncStateOne$upload$1;-><init>(Lcom/friday/document/sync/SyncStateOne;Lvc/c;)V

    :goto_0
    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->v:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v7

    .line 1
    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->x:I

    const/4 v8, 0x5

    const/4 v9, 0x4

    const/4 v10, 0x3

    const-string v11, "getAbsolutePath(...)"

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-eqz v3, :cond_6

    if-eq v3, v13, :cond_5

    if-eq v3, v12, :cond_4

    if-eq v3, v10, :cond_3

    if-eq v3, v9, :cond_2

    if-ne v3, v8, :cond_1

    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v6, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iget-object v8, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    check-cast v10, Lcom/friday/common/helper/OssUploadHelper;

    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v13, v7

    move-object v12, v11

    const/4 v7, 0x4

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x5

    goto/16 :goto_12

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->n:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->m:Ljava/lang/Object;

    check-cast v4, Lcom/friday/common/entity/MonitorRequest;

    iget-object v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    check-cast v5, Ljava/io/File;

    iget-object v6, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v9, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    check-cast v9, Ljava/util/ArrayList;

    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v13, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v12, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/helper/OssUploadHelper;

    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v14, v12

    move-object/from16 v24, v13

    move-object v13, v7

    move-object v12, v11

    const/4 v7, 0x4

    goto/16 :goto_a

    :catchall_0
    move-exception v0

    move-object v14, v12

    move-object/from16 v24, v13

    move-object v13, v7

    move-object v12, v11

    const/4 v7, 0x4

    goto/16 :goto_d

    :cond_3
    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->t:I

    iget v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->s:I

    iget v5, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    iget-object v6, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->q:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->p:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->o:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->n:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->m:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    check-cast v15, Ljava/io/File;

    move-object/from16 v18, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->i:Ljava/lang/Object;

    move-object/from16 p1, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 p2, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 p3, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    move-object/from16 p4, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/helper/OssUploadHelper;

    invoke-static/range {v18 .. v18}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    move-object/from16 v21, v9

    move-object/from16 v22, v10

    move-object/from16 v16, v12

    move-object/from16 v25, v14

    move-object/from16 v10, v19

    move-object/from16 v24, v20

    move-object/from16 v9, p4

    move-object v14, v0

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    move-object v12, v11

    move-object/from16 v0, v18

    move-object/from16 v6, p2

    move v11, v4

    move v4, v3

    move v3, v5

    move-object v5, v13

    move-object v13, v7

    const/4 v7, 0x3

    :goto_1
    move-object/from16 v8, p3

    goto/16 :goto_8

    :cond_4
    move-object/from16 v18, v0

    iget v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->t:I

    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->s:I

    iget v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    iget-object v5, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    iget-object v9, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->i:Ljava/lang/Object;

    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v12, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v13, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move/from16 v19, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/helper/OssUploadHelper;

    invoke-static/range {v18 .. v18}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v26, v2

    move-object v2, v0

    move-object/from16 v0, v18

    move-object/from16 v18, v6

    move-object/from16 v6, v26

    move-object/from16 v26, v11

    move v11, v3

    move/from16 v3, v19

    move-object/from16 v19, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object/from16 v12, v26

    goto/16 :goto_7

    :cond_5
    move-object/from16 v18, v0

    iget v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->t:I

    iget v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->s:I

    iget v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    iget-object v5, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    iget-object v9, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->i:Ljava/lang/Object;

    iget-object v10, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v12, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v13, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    check-cast v13, Ljava/util/ArrayList;

    iget-object v14, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move/from16 v19, v0

    iget-object v0, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/helper/OssUploadHelper;

    invoke-static/range {v18 .. v18}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move/from16 v17, v3

    move-object v3, v13

    move-object v13, v6

    move-object v6, v2

    move-object v2, v0

    move-object/from16 v0, v18

    move-object/from16 v18, v11

    const/4 v11, 0x1

    goto/16 :goto_5

    :cond_6
    move-object/from16 v18, v0

    invoke-static/range {v18 .. v18}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object/from16 v8, p3

    move-object/from16 v5, p4

    move-object v12, v0

    move-object v6, v2

    move-object v10, v3

    const/4 v9, 0x0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/io/File;

    .line 4
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v13

    const-string v14, "/"

    if-eqz v13, :cond_11

    .line 5
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 6
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 p1, v0

    const-string v0, "res"

    move-object/from16 p2, v3

    move-object/from16 v18, v11

    move-object/from16 p3, v12

    const/4 v3, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v15, v0, v12, v3, v11}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v15, "getName(...)"

    invoke-static {v0, v15}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, ".jpg"

    invoke-static {v0, v15, v12, v3, v11}, Lqd/z;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 7
    const-string v3, "thumbnail.jpg"

    const/4 v11, 0x1

    .line 8
    invoke-static {v0, v3, v11}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    const/4 v0, 0x0

    .line 9
    :goto_3
    invoke-virtual {v2}, Lcom/friday/common/helper/OssUploadHelper;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    if-eqz v0, :cond_a

    .line 10
    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    iput-object v5, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    iput-object v10, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->i:Ljava/lang/Object;

    iput-object v4, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    iput-object v13, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    iput-object v3, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->m:Ljava/lang/Object;

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->n:Ljava/lang/Object;

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->o:Ljava/lang/Object;

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->p:Ljava/lang/Object;

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->q:Ljava/lang/Object;

    iput v9, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    const/4 v12, 0x0

    iput v12, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->s:I

    iput v0, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->t:I

    const/4 v11, 0x1

    iput v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->x:I

    invoke-virtual {v1, v3, v6}, Lcom/friday/document/sync/SyncStateOne;->o(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v7, :cond_8

    :goto_4
    move-object v13, v7

    goto/16 :goto_11

    :cond_8
    move-object v14, v5

    move-object v5, v3

    move-object v3, v14

    move-object/from16 v15, p1

    move/from16 v19, v0

    move-object v14, v8

    move-object v0, v12

    const/16 v17, 0x0

    move-object/from16 v12, p3

    move-object v8, v4

    move v4, v9

    move-object/from16 v9, p2

    :goto_5
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_9

    move-object v0, v2

    move-object/from16 p1, v9

    move/from16 v11, v17

    move/from16 v2, v19

    move-object v9, v3

    goto :goto_6

    :cond_9
    move-object v13, v7

    move-object v1, v12

    move-object/from16 v12, v18

    const/4 v7, 0x4

    goto/16 :goto_10

    :cond_a
    move-object v11, v2

    move v2, v0

    move-object v0, v11

    move-object/from16 v15, p1

    move-object/from16 p1, p2

    move-object/from16 v12, p3

    move-object v14, v8

    const/4 v11, 0x0

    move-object v8, v4

    move v4, v9

    move-object v9, v5

    move-object v5, v3

    .line 11
    :goto_6
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    move-object/from16 p2, v12

    move-object/from16 v12, v18

    invoke-static {v3, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    move-object/from16 p3, v15

    invoke-static/range {p3 .. p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    iput-object v14, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    iput-object v9, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    iput-object v10, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->i:Ljava/lang/Object;

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    iput-object v5, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->m:Ljava/lang/Object;

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->n:Ljava/lang/Object;

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->o:Ljava/lang/Object;

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->p:Ljava/lang/Object;

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->q:Ljava/lang/Object;

    iput v4, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    iput v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->s:I

    iput v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->t:I

    const/4 v15, 0x2

    iput v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->x:I

    invoke-virtual {v0, v3, v13, v6}, Lcom/friday/common/helper/OssUploadHelper;->e(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_b

    goto/16 :goto_4

    :cond_b
    move v15, v2

    move-object v2, v0

    move-object v0, v3

    move v3, v15

    move-object/from16 v19, p3

    move-object/from16 v18, v13

    move-object v15, v14

    move-object/from16 v13, p2

    move-object v14, v9

    move-object/from16 v9, p1

    .line 13
    :goto_7
    check-cast v0, Ljava/lang/String;

    .line 14
    invoke-virtual {v1}, Lcom/friday/document/sync/SyncStateOne;->t()Z

    move-result v20

    if-eqz v20, :cond_c

    if-eqz v3, :cond_c

    .line 15
    invoke-virtual {v1, v0}, Lcom/friday/document/sync/SyncStateOne;->x(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_d

    .line 16
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u9875\u9762 SyncStateOne.kt -> upload\uff0c\u56fe\u7247\u8df3\u8fc7\u9001\u5ba1\uff0cpath="

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\uff0cossUrl="

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v20, v2

    move-object/from16 p3, v13

    move-object v13, v7

    const/4 v7, 0x4

    goto/16 :goto_f

    :cond_d
    move-object/from16 p1, v0

    .line 17
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 p2, v9

    const-string v9, "getAppPackageName(...)"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-static/range {p1 .. p1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    move-object/from16 p3, v13

    .line 19
    new-instance v13, Lcom/friday/common/entity/FlagNote;

    invoke-virtual {v1}, Lcom/friday/document/sync/SyncStateOne;->r()J

    move-result-wide v20

    move-object/from16 v22, v7

    invoke-static/range {v20 .. v21}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v13, v7}, Lcom/friday/common/entity/FlagNote;-><init>(Ljava/lang/String;)V

    invoke-static {v13}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v13, "toJson(...)"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v13, v1, Lcom/friday/document/sync/SyncStateOne;->e:Lc2/v0;

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    move-object/from16 v20, v2

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    iput-object v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    iput-object v14, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    iput-object v10, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->i:Ljava/lang/Object;

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    iput-object v5, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->m:Ljava/lang/Object;

    iput-object v7, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->n:Ljava/lang/Object;

    iput-object v9, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->o:Ljava/lang/Object;

    iput-object v0, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->p:Ljava/lang/Object;

    const-string v2, "\u4e91\u7b14\u8bb0"

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->q:Ljava/lang/Object;

    iput v4, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    iput v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->s:I

    iput v3, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->t:I

    move-object/from16 p4, v7

    const/4 v7, 0x3

    iput v7, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->x:I

    invoke-interface {v13, v1, v6}, Lc2/v0;->d(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v13, v22

    if-ne v1, v13, :cond_e

    goto/16 :goto_11

    :cond_e
    move/from16 v16, v4

    move v4, v3

    move/from16 v3, v16

    move-object/from16 v16, p1

    move-object/from16 v22, p4

    move-object/from16 v21, v9

    move-object v9, v14

    move-object/from16 v25, v18

    move-object/from16 v24, v19

    move-object/from16 v14, v20

    move-object/from16 v20, v0

    move-object v0, v1

    move-object/from16 v19, v2

    move-object v2, v6

    move-object v6, v10

    move-object v10, v15

    move-object/from16 v1, p2

    move-object v15, v8

    goto/16 :goto_1

    :goto_8
    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move/from16 v23, v0

    goto :goto_9

    :cond_f
    const/16 v23, 0x0

    .line 21
    :goto_9
    new-instance v18, Lcom/friday/common/entity/MonitorRequest;

    invoke-direct/range {v18 .. v23}, Lcom/friday/common/entity/MonitorRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    move-object/from16 v0, v18

    .line 22
    :try_start_1
    sget-object v18, Lkotlin/Result;->d:Lkotlin/Result$a;

    move-object/from16 v7, p0

    move-object/from16 p1, v1

    .line 23
    iget-object v1, v7, Lcom/friday/document/sync/SyncStateOne;->b:Ld2/i;

    iput-object v14, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    iput-object v10, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    iput-object v9, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    iput-object v6, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->i:Ljava/lang/Object;

    iput-object v15, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    iput-object v5, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->m:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->n:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->o:Ljava/lang/Object;

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->p:Ljava/lang/Object;

    iput-object v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->q:Ljava/lang/Object;

    iput v3, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    iput v11, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->s:I

    iput v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->t:I

    const/4 v4, 0x0

    iput v4, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->u:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    const/4 v7, 0x4

    :try_start_2
    iput v7, v2, Lcom/friday/document/sync/SyncStateOne$upload$1;->x:I

    invoke-interface {v1, v0, v2}, Ld2/i;->b(Lcom/friday/common/entity/MonitorRequest;Lvc/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v0, v13, :cond_10

    goto/16 :goto_11

    :cond_10
    move-object v4, v5

    move-object v5, v15

    :goto_a
    :try_start_3
    check-cast v0, Lcom/zykj/http/bean/ApiResp;

    .line 24
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_b
    move-object v1, v6

    move-object v6, v2

    move-object v2, v14

    move-object v14, v10

    move-object v10, v1

    move-object v1, v8

    move-object/from16 v15, v24

    move-object v8, v5

    move-object v5, v4

    move v4, v3

    move-object v3, v9

    goto :goto_e

    :catchall_1
    move-exception v0

    goto :goto_d

    :catchall_2
    move-exception v0

    :goto_c
    move-object v4, v5

    move-object v5, v15

    goto :goto_d

    :catchall_3
    move-exception v0

    const/4 v7, 0x4

    goto :goto_c

    :goto_d
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_b

    :goto_e
    invoke-static {v0}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    goto :goto_10

    :goto_f
    move-object/from16 v1, p3

    move-object v3, v14

    move-object v14, v15

    move-object/from16 v15, v19

    move-object/from16 v2, v20

    .line 25
    :goto_10
    new-instance v0, Lcom/friday/common/entity/NoteResource;

    .line 26
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {v0, v8, v5}, Lcom/friday/common/entity/NoteResource;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-object v5, v3

    move v9, v4

    move-object v8, v14

    move-object v0, v15

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x5

    goto/16 :goto_13

    :cond_11
    move-object/from16 p1, v0

    move-object/from16 p2, v3

    move-object v13, v7

    move-object/from16 p3, v12

    const/4 v7, 0x4

    move-object v12, v11

    .line 29
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    move-result-object v3

    .line 30
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 31
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    iput-object v2, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->c:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->d:Ljava/lang/Object;

    iput-object v8, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->e:Ljava/lang/Object;

    iput-object v5, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->f:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->g:Ljava/lang/Object;

    iput-object v10, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->h:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->i:Ljava/lang/Object;

    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->j:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->k:Ljava/lang/Object;

    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->l:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->m:Ljava/lang/Object;

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->n:Ljava/lang/Object;

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->o:Ljava/lang/Object;

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->p:Ljava/lang/Object;

    iput-object v11, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->q:Ljava/lang/Object;

    iput v9, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->r:I

    const/4 v14, 0x0

    iput v14, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->s:I

    const/4 v15, 0x5

    iput v15, v6, Lcom/friday/document/sync/SyncStateOne$upload$1;->x:I

    move-object/from16 v1, p0

    move-object v4, v0

    invoke-virtual/range {v1 .. v6}, Lcom/friday/document/sync/SyncStateOne;->z(Lcom/friday/common/helper/OssUploadHelper;Ljava/util/List;Ljava/lang/String;Ljava/util/ArrayList;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_12

    :goto_11
    return-object v13

    :cond_12
    move v3, v9

    move-object v4, v10

    move-object/from16 v9, p1

    move-object v10, v2

    move-object v2, v6

    move-object v6, v5

    move-object/from16 v5, p3

    :goto_12
    move-object v1, v5

    move-object v5, v6

    move-object v0, v9

    move-object v6, v2

    move v9, v3

    move-object v2, v10

    move-object v10, v4

    :goto_13
    move-object v11, v12

    move-object v7, v13

    move-object v12, v1

    move-object/from16 v1, p0

    goto/16 :goto_2

    .line 32
    :cond_13
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method
