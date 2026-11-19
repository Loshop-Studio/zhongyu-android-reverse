# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class final Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.main.viewmodel.FolderMoveViewModel$copyNote$1$2$1"
    f = "FolderMoveViewModel.kt"
    l = {
        0x18b,
        0x190
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Ljava/util/List;

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

.field public q:Ljava/lang/Object;

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lcom/friday/main/viewmodel/FolderMoveViewModel;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/util/List;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->x:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->y:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->z:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->A:Ljava/util/List;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->x:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->y:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->z:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->A:Ljava/util/List;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/util/List;Lvc/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v1, p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->w:I

    const-string v3, "getName(...)"

    const-string v4, "getAbsolutePath(...)"

    const-string v5, "listFilesInDir(...)"

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v7, :cond_1

    if-ne v2, v6, :cond_0

    iget v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->u:I

    iget v10, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->t:I

    iget v11, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->s:I

    iget v12, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->r:I

    iget-object v13, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->q:Ljava/lang/Object;

    check-cast v13, [F

    iget-object v13, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->p:Ljava/lang/Object;

    check-cast v13, Ljava/io/File;

    iget-object v13, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->n:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->m:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v15, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->l:Ljava/lang/Object;

    check-cast v15, Ljava/io/File;

    iget-object v7, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->k:Ljava/lang/Object;

    check-cast v7, Ljava/io/File;

    iget-object v6, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->j:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    iget-object v8, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->i:Ljava/lang/Object;

    iget-object v9, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->h:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    move/from16 v18, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->g:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    move-object/from16 v19, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->f:Ljava/lang/Object;

    check-cast v2, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    move-object/from16 v20, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->e:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 v21, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 v22, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    move-object v3, v8

    const/4 v4, 0x2

    const/16 v16, 0x1

    move-object v8, v0

    move-object v0, v6

    move-object/from16 v6, v21

    move-object/from16 v21, v5

    move-object v5, v15

    move/from16 v15, v18

    goto/16 :goto_a

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->v:I

    iget v6, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->u:I

    iget v7, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->t:I

    iget v8, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->s:I

    iget v9, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->r:I

    iget-object v10, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->p:Ljava/lang/Object;

    check-cast v10, Ljava/io/File;

    iget-object v11, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->o:Ljava/lang/Object;

    iget-object v12, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->n:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->m:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v14, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->l:Ljava/lang/Object;

    check-cast v14, Ljava/io/File;

    iget-object v15, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->k:Ljava/lang/Object;

    check-cast v15, Ljava/io/File;

    move/from16 v18, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->j:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    move-object/from16 v19, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->i:Ljava/lang/Object;

    move-object/from16 v20, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->h:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    move-object/from16 v21, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->g:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    move-object/from16 v22, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->f:Ljava/lang/Object;

    check-cast v2, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    move-object/from16 v23, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->e:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 v24, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 v25, v2

    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v13

    move v13, v8

    move/from16 v8, v18

    move-object/from16 v18, v16

    move-object/from16 v28, v3

    move-object/from16 v27, v4

    move-object v3, v12

    const/16 v16, 0x1

    move-object v4, v0

    move v12, v9

    move-object v0, v14

    move-object/from16 v9, v25

    move v14, v7

    move-object/from16 v7, v22

    move-object/from16 v22, v11

    move-object v11, v10

    move-object/from16 v10, v21

    move-object/from16 v21, v5

    move-object v5, v2

    move-object/from16 v2, v23

    move-object/from16 v23, v15

    move v15, v6

    move-object/from16 v6, v24

    goto/16 :goto_8

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->x:Ljava/lang/String;

    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    iget-object v6, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->y:Ljava/lang/String;

    iget-object v7, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->x:Ljava/lang/String;

    iget-object v8, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->z:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    iget-object v9, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->A:Ljava/util/List;

    .line 3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v12, v7

    move-object v13, v8

    move-object v14, v9

    move-object v15, v10

    const/16 v18, 0x0

    move-object v8, v6

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/io/File;

    .line 4
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "page_router.bin"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 5
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter;->k()Lcom/zykj/board/EzyPageRouter$PageRouter$b;

    move-result-object v6

    .line 6
    invoke-static {}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;->k()Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    move-result-object v7

    .line 7
    invoke-virtual {v7, v8}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->q(Ljava/lang/String;)Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    move-result-object v7

    const/4 v9, 0x0

    .line 8
    invoke-virtual {v7, v9}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->r(I)Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;

    move-result-object v7

    invoke-virtual {v7}, Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo$b;->d()Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;

    move-result-object v7

    .line 9
    invoke-virtual {v6, v7}, Lcom/zykj/board/EzyPageRouter$PageRouter$b;->d(Lcom/zykj/board/EzyPageRouter$PageRouter$PageInfo;)Lcom/zykj/board/EzyPageRouter$PageRouter$b;

    move-result-object v6

    .line 10
    invoke-virtual {v6}, Lcom/zykj/board/EzyPageRouter$PageRouter$b;->f()Lcom/zykj/board/EzyPageRouter$PageRouter;

    move-result-object v6

    .line 11
    sget-object v7, Lna/k;->a:Lna/k;

    .line 12
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {v7, v12, v10, v6}, Lna/k;->c(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;

    :goto_1
    move-object/from16 v26, v0

    move-object/from16 p1, v2

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    move-object/from16 v21, v5

    move-object/from16 v19, v8

    move-object/from16 v20, v12

    :goto_2
    const/4 v4, 0x2

    const/16 v16, 0x1

    goto/16 :goto_d

    .line 14
    :cond_3
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    const/16 v10, 0x24

    if-ne v9, v10, :cond_7

    .line 15
    new-instance v6, Ljava/io/File;

    const-string v9, "page_mdb"

    invoke-direct {v6, v12, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 16
    invoke-static {v13, v12}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->o(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;)V

    goto :goto_1

    .line 17
    :cond_4
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v8}, Lcom/blankj/utilcode/util/FileUtils;->rename(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 18
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 19
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 20
    new-instance v9, Ljava/io/FileInputStream;

    .line 21
    new-instance v10, Ljava/io/File;

    const-string v11, "router.bin"

    invoke-direct {v10, v6, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    invoke-direct {v9, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 23
    :try_start_0
    invoke-static {v9}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->U(Ljava/io/InputStream;)Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v10

    move-object/from16 p1, v2

    .line 24
    invoke-virtual {v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->E()Ljava/util/List;

    move-result-object v2

    move-object/from16 v19, v8

    const-string v8, "getCommandRecordList(...)"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const-string v8, "_command.bin"

    .line 26
    invoke-static {v13, v6, v2, v8, v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->q(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v2

    .line 27
    invoke-virtual {v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->C()Ljava/util/List;

    move-result-object v8

    move-object/from16 v20, v2

    const-string v2, "getAudioRecordList(...)"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    const-string v2, "_audio.bin"

    .line 29
    invoke-static {v13, v6, v8, v2, v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->q(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v2

    .line 30
    invoke-virtual {v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->Q()Ljava/util/List;

    move-result-object v8

    move-object/from16 v21, v2

    const-string v2, "getTouchSourceRecordList(...)"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    const-string v2, "_touch.bin"

    .line 32
    invoke-static {v13, v6, v8, v2, v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->q(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v2

    .line 33
    invoke-virtual {v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->I()Ljava/util/List;

    move-result-object v8

    move-object/from16 v22, v2

    const-string v2, "getFileSourceRecordList(...)"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    const-string v2, "_file.bin"

    .line 35
    invoke-static {v13, v6, v8, v2, v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->q(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v2

    .line 36
    invoke-virtual {v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->O()Ljava/util/List;

    move-result-object v8

    move-object/from16 v23, v2

    const-string v2, "getTextSourceRecordList(...)"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    const-string v2, "_text.bin"

    .line 38
    invoke-static {v13, v6, v8, v2, v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->q(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v2

    .line 39
    invoke-virtual {v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->M()Ljava/util/List;

    move-result-object v8

    move-object/from16 v24, v2

    const-string v2, "getMatrixSourceRecordList(...)"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    const-string v2, "_matrix.bin"

    .line 41
    invoke-static {v13, v6, v8, v2, v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->q(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    move-result-object v2

    .line 42
    invoke-virtual {v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord;->V()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 43
    invoke-virtual {v8}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->w()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 44
    invoke-virtual {v8}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->v()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 45
    invoke-virtual {v8}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->y()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 46
    invoke-virtual {v8}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->z()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 47
    invoke-virtual {v8}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->B()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 48
    invoke-virtual {v8}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->C()Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 49
    move-object/from16 v10, v20

    check-cast v10, Ljava/lang/Iterable;

    .line 50
    invoke-virtual {v8, v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->d(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 51
    move-object/from16 v10, v21

    check-cast v10, Ljava/lang/Iterable;

    .line 52
    invoke-virtual {v8, v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 53
    move-object/from16 v10, v22

    check-cast v10, Ljava/lang/Iterable;

    .line 54
    invoke-virtual {v8, v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->h(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 55
    move-object/from16 v10, v23

    check-cast v10, Ljava/lang/Iterable;

    .line 56
    invoke-virtual {v8, v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->e(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 57
    move-object/from16 v10, v24

    check-cast v10, Ljava/lang/Iterable;

    .line 58
    invoke-virtual {v8, v10}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->g(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v8

    .line 59
    check-cast v2, Ljava/lang/Iterable;

    .line 60
    invoke-virtual {v8, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->f(Ljava/lang/Iterable;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;

    move-result-object v2

    .line 61
    invoke-virtual {v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$b;->q()Lcom/zykj/board/EzyRouterRecord$RouterRecord;

    move-result-object v2

    .line 62
    sget-object v8, Lna/k;->a:Lna/k;

    .line 63
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 64
    invoke-virtual {v8, v6, v11, v2}, Lna/k;->c(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v2, 0x0

    .line 65
    invoke-static {v9, v2}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 66
    new-instance v2, Ljava/io/FileInputStream;

    .line 67
    new-instance v9, Ljava/io/File;

    const-string v10, "snapshot.bin"

    invoke-direct {v9, v6, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-direct {v2, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 69
    :try_start_1
    invoke-static {v2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->t(Ljava/io/InputStream;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    move-result-object v9

    .line 70
    invoke-virtual {v9}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->u()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    move-result-object v9

    .line 71
    invoke-virtual {v9}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->o()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v11

    move-object/from16 v20, v12

    const-string v12, "getGraphSnapshot(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    invoke-static {v13, v11, v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->r(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v7

    .line 73
    invoke-virtual {v9, v7}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->y(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;

    .line 74
    sget-object v7, Lqc/q;->a:Lqc/q;

    invoke-virtual {v9}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$b;->d()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    move-result-object v7

    const-string v9, "build(...)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    invoke-virtual {v8, v6, v10, v7}, Lna/k;->c(Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/MessageLite;)Ljava/io/File;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v6, 0x0

    .line 76
    invoke-static {v2, v6}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    move-object/from16 v26, v0

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    move-object/from16 v21, v5

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object v3, v0

    :try_start_2
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v2, v3}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 77
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v9, v2}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    move-object/from16 p1, v2

    move-object/from16 v19, v8

    move-object/from16 v20, v12

    goto :goto_3

    :cond_7
    move-object/from16 p1, v2

    move-object/from16 v19, v8

    move-object/from16 v20, v12

    .line 78
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v8, "res"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 79
    invoke-static {v7}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    .line 80
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljava/io/File;

    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "image"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_4

    :cond_9
    const/4 v8, 0x0

    :goto_4
    check-cast v8, Ljava/io/File;

    if-eqz v8, :cond_5

    .line 81
    invoke-static {v8}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    .line 82
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-object/from16 v21, v5

    move-object v10, v8

    move-object v11, v10

    move-object v12, v9

    move-object v5, v13

    move/from16 v8, v18

    move-object/from16 v9, v19

    const/4 v13, 0x0

    move-object/from16 v18, v2

    move-object/from16 v19, v6

    move-object v6, v14

    move-object/from16 v2, v20

    const/4 v14, 0x0

    move-object/from16 v20, v7

    move-object v7, v15

    const/4 v15, 0x0

    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v23, v10

    move-object/from16 v10, v22

    check-cast v10, Ljava/io/File;

    .line 83
    move-object/from16 v24, v6

    check-cast v24, Ljava/lang/Iterable;

    invoke-interface/range {v24 .. v24}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v24

    :goto_6
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_b

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v26, v25

    check-cast v26, Lcom/friday/common/entity/ResourceEntity;

    move-object/from16 v27, v4

    .line 84
    invoke-virtual/range {v26 .. v26}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v26, v0

    .line 85
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v28, v3

    move/from16 v30, v14

    move/from16 v29, v15

    const/4 v3, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x2

    .line 86
    invoke-static {v4, v0, v14, v15, v3}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    move-object/from16 v17, v25

    goto :goto_7

    :cond_a
    move-object/from16 v0, v26

    move-object/from16 v4, v27

    move-object/from16 v3, v28

    move/from16 v15, v29

    move/from16 v14, v30

    goto :goto_6

    :cond_b
    move-object/from16 v26, v0

    move-object/from16 v28, v3

    move-object/from16 v27, v4

    move/from16 v30, v14

    move/from16 v29, v15

    const/4 v3, 0x0

    move-object/from16 v17, v3

    .line 87
    :goto_7
    check-cast v17, Lcom/friday/common/entity/ResourceEntity;

    if-eqz v17, :cond_e

    .line 88
    invoke-virtual/range {v17 .. v17}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    move-result v0

    if-nez v0, :cond_e

    .line 89
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    move-result-object v0

    new-instance v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1$1$4$1$result$1;

    invoke-direct {v4, v10, v3}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1$1$4$1$result$1;-><init>(Ljava/io/File;Lvc/c;)V

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->c:Ljava/lang/Object;

    iput-object v9, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->d:Ljava/lang/Object;

    iput-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->e:Ljava/lang/Object;

    iput-object v5, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->f:Ljava/lang/Object;

    iput-object v6, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->g:Ljava/lang/Object;

    iput-object v7, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->h:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->i:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->j:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->k:Ljava/lang/Object;

    iput-object v11, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->l:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->m:Ljava/lang/Object;

    iput-object v12, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->n:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->o:Ljava/lang/Object;

    iput-object v10, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->p:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->q:Ljava/lang/Object;

    iput v8, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->r:I

    iput v13, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->s:I

    move/from16 v14, v30

    iput v14, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->t:I

    move/from16 v15, v29

    iput v15, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->u:I

    const/4 v3, 0x0

    iput v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->v:I

    const/4 v3, 0x1

    iput v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->w:I

    invoke-static {v0, v4, v1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v4, v26

    if-ne v0, v4, :cond_c

    move-object v8, v4

    goto/16 :goto_9

    :cond_c
    move-object/from16 v16, v5

    move-object/from16 v5, p1

    move-object/from16 p1, v0

    move-object v0, v11

    move-object v11, v10

    move-object v10, v7

    move-object v7, v6

    move-object v6, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v16

    move/from16 v16, v3

    move-object v3, v12

    move v12, v8

    const/4 v8, 0x0

    .line 90
    :goto_8
    move-object/from16 v24, p1

    check-cast v24, [F

    move-object/from16 p1, v5

    .line 91
    new-instance v5, Lcom/friday/common/entity/ImageSafetyEntity;

    move-object/from16 v25, v11

    .line 92
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v26, v4

    move-object/from16 v4, v27

    invoke-static {v11, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    aget v27, v24, v16

    move-object/from16 v29, v4

    const/16 v4, 0x64

    int-to-float v4, v4

    mul-float v4, v4, v27

    float-to-int v4, v4

    .line 94
    invoke-direct {v5, v11, v4}, Lcom/friday/common/entity/ImageSafetyEntity;-><init>(Ljava/lang/String;I)V

    .line 95
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->c:Ljava/lang/Object;

    iput-object v9, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->d:Ljava/lang/Object;

    iput-object v6, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->e:Ljava/lang/Object;

    iput-object v2, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->f:Ljava/lang/Object;

    iput-object v7, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->g:Ljava/lang/Object;

    iput-object v10, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->i:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->j:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->k:Ljava/lang/Object;

    iput-object v0, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->l:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->m:Ljava/lang/Object;

    iput-object v3, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->n:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->o:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->p:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->q:Ljava/lang/Object;

    iput v12, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->r:I

    iput v13, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->s:I

    iput v14, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->t:I

    iput v15, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->u:I

    iput v8, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->v:I

    const/4 v4, 0x2

    iput v4, v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;->w:I

    invoke-static {v2, v5, v1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->p(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v8, v26

    if-ne v5, v8, :cond_d

    :goto_9
    return-object v8

    :cond_d
    move-object v5, v0

    move-object/from16 v22, v9

    move-object v9, v10

    move v11, v13

    move v10, v14

    move-object/from16 v14, v18

    move-object/from16 v0, v19

    move-object v13, v3

    move-object/from16 v19, v7

    move-object/from16 v3, v20

    move-object/from16 v7, v23

    move-object/from16 v20, v2

    move-object/from16 v2, p1

    :goto_a
    move-object/from16 v26, v8

    move v8, v12

    move-object v12, v13

    move-object/from16 v18, v14

    move v14, v10

    move v13, v11

    move-object v11, v5

    move-object v10, v7

    move-object v7, v9

    move-object/from16 v5, v20

    move-object/from16 v9, v22

    move-object/from16 v20, v0

    goto :goto_b

    :cond_e
    move/from16 v15, v29

    move/from16 v14, v30

    const/4 v4, 0x2

    const/16 v16, 0x1

    move-object/from16 v29, v27

    .line 96
    invoke-static {v10}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    move-result v0

    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-object/from16 v3, v19

    move-object/from16 v10, v23

    move-object/from16 v19, v6

    move-object v6, v2

    move-object/from16 v2, p1

    :goto_b
    move-object/from16 p1, v2

    move-object v2, v6

    move-object/from16 v6, v19

    move-object/from16 v0, v26

    move-object/from16 v4, v29

    move-object/from16 v19, v3

    move-object/from16 v3, v28

    goto/16 :goto_5

    :cond_f
    move-object/from16 v26, v0

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    const/4 v4, 0x2

    const/16 v16, 0x1

    move-object v12, v2

    move-object v13, v5

    move-object v14, v6

    move-object v15, v7

    move/from16 v18, v8

    move-object v8, v9

    :goto_c
    move-object/from16 v2, p1

    goto :goto_e

    :goto_d
    move-object/from16 v8, v19

    move-object/from16 v12, v20

    goto :goto_c

    :goto_e
    move-object/from16 v5, v21

    move-object/from16 v0, v26

    move-object/from16 v3, v28

    move-object/from16 v4, v29

    goto/16 :goto_0

    .line 97
    :cond_10
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method
