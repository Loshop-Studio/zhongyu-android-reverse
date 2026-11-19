# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class final Lcom/friday/document/service/FileManager$downloadFileOnShare$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/service/FileManager;->v(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.service.FileManager$downloadFileOnShare$2"
    f = "FileManager.kt"
    l = {
        0x1aa,
        0x1bd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public final synthetic v:Lcom/friday/document/model/ShareFile;

.field public final synthetic w:Lcom/friday/document/service/FileManager;


# direct methods
.method public constructor <init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/service/FileManager;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->v:Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->w:Lcom/friday/document/service/FileManager;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->v:Lcom/friday/document/model/ShareFile;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->w:Lcom/friday/document/service/FileManager;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;-><init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    move-object/from16 v0, p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->u:I

    const/4 v3, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->i:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->h:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->f:Ljava/lang/Object;

    check-cast v1, Ljava/lang/reflect/Type;

    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->r:I

    iget v7, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->q:I

    iget-object v8, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->p:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->o:Ljava/lang/Object;

    check-cast v8, Lcom/friday/common/entity/NoteResource;

    iget-object v8, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->m:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->l:Ljava/lang/Object;

    check-cast v9, Lcom/friday/document/model/ShareFile;

    iget-object v10, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->k:Ljava/lang/Object;

    check-cast v10, Lcom/friday/document/service/FileManager;

    iget-object v11, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->j:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v12, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->i:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->h:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->g:Ljava/lang/Object;

    check-cast v14, Ljava/util/ArrayList;

    iget-object v15, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->f:Ljava/lang/Object;

    check-cast v15, Ljava/lang/reflect/Type;

    iget-object v3, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->c:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v20, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    goto/16 :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "res.json"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 3
    invoke-static {v9}, Lcom/blankj/utilcode/util/FileUtils;->createFileByDeleteOldFile(Ljava/lang/String;)Z

    .line 4
    sget-object v4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    invoke-virtual {v4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    move-result-object v4

    .line 5
    iget-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->v:Lcom/friday/document/model/ShareFile;

    invoke-virtual {v5}, Lcom/friday/document/model/ShareFile;->getOwnerId()J

    move-result-wide v7

    iget-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->v:Lcom/friday/document/model/ShareFile;

    invoke-virtual {v5}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    move-result-object v5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-virtual {v4, v2}, Lcom/friday/common/helper/b;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 7
    sget-object v2, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    invoke-virtual {v2}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    move-result-object v7

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 8
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-static {v2, v6, v4, v6}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 9
    new-instance v4, Lcom/friday/document/service/FileManager$downloadFileOnShare$2$a;

    invoke-direct {v4}, Lcom/friday/document/service/FileManager$downloadFileOnShare$2$a;-><init>()V

    invoke-virtual {v4}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v4

    .line 10
    new-instance v5, Lcom/google/gson/Gson;

    invoke-direct {v5}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5, v2, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    .line 11
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    move-result-object v7

    iget-object v10, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->w:Lcom/friday/document/service/FileManager;

    invoke-static {v10}, Lcom/friday/document/service/FileManager;->q(Lcom/friday/document/service/FileManager;)J

    move-result-wide v10

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "share"

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 12
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v10, "yyyy-MM-dd HH:mm:ss"

    sget-object v11, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {v7, v10, v11}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v10}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    if-eqz v5, :cond_8

    .line 13
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_3

    goto/16 :goto_3

    .line 14
    :cond_3
    iget-object v10, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->w:Lcom/friday/document/service/FileManager;

    iget-object v11, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->v:Lcom/friday/document/model/ShareFile;

    .line 15
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move-object v13, v3

    move-object v15, v4

    move-object v14, v5

    move-object/from16 v30, v7

    move-object v4, v8

    move-object v8, v12

    const/4 v7, 0x0

    const/16 v22, 0x0

    move-object v3, v2

    move-object v5, v9

    move-object v9, v11

    move-object v11, v14

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v12, v22, 0x1

    if-gez v22, :cond_4

    invoke-static {}, Lrc/w;->w()V

    :cond_4
    move-object/from16 v32, v2

    check-cast v32, Lcom/friday/common/entity/NoteResource;

    .line 16
    invoke-virtual/range {v32 .. v32}, Lcom/friday/common/entity/NoteResource;->getService()Ljava/lang/String;

    move-result-object v6

    move-object/from16 p1, v2

    const-string v2, "thumbnail.jpg"

    move-object/from16 v33, v3

    const/4 v3, 0x1

    invoke-static {v6, v2, v3}, Lqd/c0;->S(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 17
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".jpg"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    .line 18
    sget-object v2, Lcom/friday/common/helper/d;->d:Lcom/friday/common/helper/d$a;

    invoke-virtual {v2}, Lcom/friday/common/helper/d$a;->a()Lcom/friday/common/helper/d;

    move-result-object v23

    .line 19
    invoke-virtual/range {v32 .. v32}, Lcom/friday/common/entity/NoteResource;->getService()Ljava/lang/String;

    move-result-object v24

    const/16 v27, 0x4

    const/16 v28, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v19

    .line 20
    invoke-static/range {v23 .. v28}, Lcom/friday/common/helper/d;->h(Lcom/friday/common/helper/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 21
    invoke-static {v10}, Lcom/friday/document/service/FileManager;->k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v2

    .line 22
    new-instance v18, Lcom/friday/common/entity/ResourceEntity;

    .line 23
    invoke-virtual {v9}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    move-result-object v20

    .line 24
    invoke-static {v10}, Lcom/friday/document/service/FileManager;->q(Lcom/friday/document/service/FileManager;)J

    move-result-wide v25

    const/16 v28, 0x0

    const/16 v29, 0x0

    .line 25
    const-string v21, ""

    const-string v23, ""

    const-string v24, ""

    const/16 v27, 0x2

    move-object/from16 v31, v30

    invoke-direct/range {v18 .. v31}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, v18

    move-object/from16 v18, v4

    move-object v4, v3

    move-object/from16 v20, v5

    move/from16 v6, v22

    move-object/from16 v3, v30

    .line 26
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->c:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->d:Ljava/lang/Object;

    invoke-static/range {v33 .. v33}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->e:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->f:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->g:Ljava/lang/Object;

    iput-object v13, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->h:Ljava/lang/Object;

    iput-object v3, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->i:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->j:Ljava/lang/Object;

    iput-object v10, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->k:Ljava/lang/Object;

    iput-object v9, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->l:Ljava/lang/Object;

    iput-object v8, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->m:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->n:Ljava/lang/Object;

    invoke-static/range {v32 .. v32}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->o:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->p:Ljava/lang/Object;

    iput v7, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->q:I

    iput v12, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->r:I

    iput v6, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->s:I

    const/4 v5, 0x0

    iput v5, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->t:I

    const/4 v6, 0x1

    iput v6, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->u:I

    invoke-interface {v2, v4, v0}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto/16 :goto_4

    :cond_5
    move v2, v12

    move-object/from16 v4, v18

    move-object v12, v3

    move-object/from16 v3, v33

    :goto_1
    move/from16 v22, v2

    move-object/from16 v30, v12

    goto :goto_2

    :cond_6
    move-object/from16 v18, v4

    move-object/from16 v20, v5

    move-object/from16 v3, v30

    const/4 v5, 0x0

    const/4 v6, 0x1

    move/from16 v22, v12

    move-object/from16 v3, v33

    :goto_2
    move-object/from16 v5, v20

    const/4 v6, 0x0

    goto/16 :goto_0

    :cond_7
    move-object/from16 v33, v3

    move-object/from16 v18, v4

    move-object/from16 v20, v5

    move-object/from16 v3, v30

    move-object v7, v3

    move-object v3, v13

    move-object v5, v14

    move-object v4, v15

    move-object/from16 v8, v18

    move-object/from16 v9, v20

    move-object/from16 v2, v33

    .line 27
    :cond_8
    :goto_3
    iget-object v6, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->w:Lcom/friday/document/service/FileManager;

    invoke-static {v6}, Lcom/friday/document/service/FileManager;->l(Lcom/friday/document/service/FileManager;)Lc2/g2;

    move-result-object v6

    .line 28
    new-instance v16, Lcom/friday/common/entity/ShareCacheEntity;

    .line 29
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    move-result-object v10

    const-string v11, "get32UUID(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object v11, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->v:Lcom/friday/document/model/ShareFile;

    invoke-virtual {v11}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    move-result-object v18

    .line 31
    iget-object v11, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->v:Lcom/friday/document/model/ShareFile;

    invoke-virtual {v11}, Lcom/friday/document/model/ShareFile;->getVersion()I

    move-result v19

    .line 32
    iget-object v11, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->w:Lcom/friday/document/service/FileManager;

    invoke-static {v11}, Lcom/friday/document/service/FileManager;->q(Lcom/friday/document/service/FileManager;)J

    move-result-wide v20

    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v22

    move-object/from16 v17, v10

    .line 34
    invoke-direct/range {v16 .. v23}, Lcom/friday/common/entity/ShareCacheEntity;-><init>(Ljava/lang/String;Ljava/lang/String;IJJ)V

    move-object/from16 v10, v16

    .line 35
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->c:Ljava/lang/Object;

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->d:Ljava/lang/Object;

    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->e:Ljava/lang/Object;

    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->f:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->g:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->h:Ljava/lang/Object;

    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->i:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->j:Ljava/lang/Object;

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->k:Ljava/lang/Object;

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->l:Ljava/lang/Object;

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->m:Ljava/lang/Object;

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->n:Ljava/lang/Object;

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->o:Ljava/lang/Object;

    iput-object v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->p:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, v0, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;->u:I

    invoke-interface {v6, v10, v0}, Lc2/g2;->g(Lcom/friday/common/entity/ShareCacheEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_9

    :goto_4
    return-object v1

    .line 36
    :cond_9
    :goto_5
    sget-object v1, Lqc/q;->a:Lqc/q;

    return-object v1
.end method
