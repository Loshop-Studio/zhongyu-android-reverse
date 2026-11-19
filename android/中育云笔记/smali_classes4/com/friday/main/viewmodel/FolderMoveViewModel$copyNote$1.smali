.class final Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FolderMoveViewModel;->s(Ljava/util/List;Lcom/friday/common/entity/FileEntity;)V
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
    c = "com.friday.main.viewmodel.FolderMoveViewModel$copyNote$1"
    f = "FolderMoveViewModel.kt"
    l = {
        0xe0,
        0xe7,
        0xeb,
        0xf3,
        0xfd,
        0x1b1,
        0x1c5,
        0x1d5,
        0x1da,
        0x1c9,
        0x1e5,
        0x1ea,
        0x1ec
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

.field public final synthetic B:Lcom/friday/common/entity/FileEntity;

.field public final synthetic C:Ljava/util/List;

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->C:Ljava/util/List;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->C:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    move-object/from16 v4, p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v7

    .line 1
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v5, v4

    goto/16 :goto_1f

    :catch_0
    move-exception v0

    move-object v5, v4

    move-object v14, v7

    goto/16 :goto_1d

    :pswitch_2
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iget v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iget-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v15, v5

    move-object v14, v7

    move-object v5, v4

    goto/16 :goto_1c

    :pswitch_3
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iget v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iget-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v14, v7

    goto/16 :goto_1a

    :pswitch_4
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->f:I

    iget v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    iget v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iget v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iget-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->y:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    iget-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->x:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/dao/ResourceDao;

    iget-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->w:Ljava/lang/Object;

    check-cast v9, Lcom/friday/common/entity/ResourceEntity;

    iget-object v13, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    check-cast v13, [F

    iget-object v13, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    check-cast v13, Lcom/friday/common/entity/ResourceEntity;

    iget-object v13, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    check-cast v14, Ljava/util/Collection;

    iget-object v15, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    check-cast v8, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    iget-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/entity/FileEntity;

    iget-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v10, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    move/from16 v19, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object/from16 v39, v6

    move v6, v1

    move-object v1, v7

    move-object v7, v12

    move-object v12, v9

    move-object/from16 v9, v39

    goto/16 :goto_16

    :pswitch_5
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->g:I

    iget v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->f:I

    iget v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    iget v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iget v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iget-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->x:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->w:Ljava/lang/Object;

    check-cast v8, Lcom/friday/common/dao/ResourceDao;

    iget-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    check-cast v9, Lcom/friday/common/entity/ResourceEntity;

    iget-object v10, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    check-cast v10, Lcom/friday/common/entity/ResourceEntity;

    iget-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->t:Ljava/lang/Object;

    iget-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    check-cast v13, Ljava/util/Collection;

    iget-object v14, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v15, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    check-cast v15, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    move/from16 v19, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/entity/FileEntity;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object/from16 v38, v7

    move-object/from16 v35, v11

    move-object/from16 v36, v14

    move-object/from16 v37, v24

    move-object/from16 v11, v25

    move v7, v5

    move-object v14, v12

    move v5, v2

    move-object v12, v9

    move-object v2, v13

    move-object/from16 v13, v22

    move-object v9, v8

    move-object v8, v6

    move v6, v3

    move-object/from16 v3, v20

    move/from16 v20, v19

    move-object/from16 v19, v10

    move-object/from16 v10, v23

    goto/16 :goto_15

    :pswitch_6
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_5
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_12

    :pswitch_7
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->f:I

    iget v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    iget v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iget v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iget-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    check-cast v5, Ljava/io/File;

    iget-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v10, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    check-cast v11, Lcom/friday/common/entity/FileEntity;

    iget-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    check-cast v12, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    iget-object v13, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    iget-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    move/from16 v16, v0

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    move-object/from16 v20, v0

    check-cast v20, Ljava/lang/String;

    :try_start_6
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object/from16 v23, v13

    move/from16 v0, v16

    move-object/from16 v32, v20

    goto/16 :goto_b

    :catchall_0
    move-exception v0

    goto/16 :goto_10

    :pswitch_8
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    iget v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iget v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iget-object v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/FileEntity;

    iget-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    check-cast v6, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    move-object v13, v8

    check-cast v13, Ljava/lang/String;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    move-object v14, v8

    check-cast v14, Ljava/lang/String;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    move-object v15, v8

    check-cast v15, Ljava/lang/String;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    move-object/from16 v20, v8

    check-cast v20, Ljava/lang/String;

    :try_start_7
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_1
    const/4 v8, 0x1

    goto/16 :goto_9

    :pswitch_9
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iget v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iget-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    :try_start_8
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-object v14, v3

    move-object v15, v5

    move-object v5, v8

    const/4 v3, 0x2

    :goto_2
    move-object v9, v2

    move v2, v0

    goto/16 :goto_8

    :pswitch_a
    iget v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iget-object v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    :try_start_9
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move v8, v0

    move-object/from16 v0, p1

    goto/16 :goto_7

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_c
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-object/from16 v0, p1

    goto :goto_4

    :pswitch_d
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    :try_start_a
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->j(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v0

    iget-object v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    const-wide/16 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    :goto_3
    move-object v5, v4

    move-object v14, v7

    goto/16 :goto_1e

    .line 3
    :cond_0
    :goto_4
    check-cast v0, Ljava/lang/Iterable;

    .line 4
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 7
    move-object v5, v3

    check-cast v5, Lcom/friday/common/entity/ResourceEntity;

    .line 8
    invoke-virtual {v5}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    move-result-object v5

    .line 9
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 10
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 11
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v8

    const/16 v0, 0x63

    if-lt v8, v0, :cond_3

    .line 12
    const-string v0, "\u5df2\u8fbe\u9875\u6570\u4e0a\u9650\uff0c\u65e0\u6cd5\u65b0\u589e\u7b14\u8bb0\u9875"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    .line 14
    :cond_3
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 15
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->m(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    move-result-object v0

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    const/4 v2, 0x2

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-interface {v0, v1, v4}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_4

    goto :goto_3

    .line 16
    :cond_4
    :goto_6
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    .line 17
    :cond_5
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v9

    .line 18
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->j(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v0

    iget-object v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v1

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    iput v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    const/4 v2, 0x3

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    const-wide/16 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->G(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    goto/16 :goto_3

    :cond_6
    move-object v1, v9

    :goto_7
    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v11

    .line 20
    iget-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->C:Ljava/util/List;

    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    move-result-object v9

    .line 21
    const-string v2, "/"

    const/4 v3, 0x2

    const/4 v5, 0x0

    invoke-static {v9, v2, v5, v3, v5}, Lqd/c0;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    .line 22
    invoke-static/range {v9 .. v14}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v19

    .line 23
    iget-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->C:Ljava/util/List;

    invoke-static {v2}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getFileId()Ljava/lang/String;

    move-result-object v20

    iget-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v21

    const/16 v23, 0x4

    const/16 v24, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 24
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    move-result-object v5

    new-instance v6, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$1;

    const/4 v12, 0x0

    invoke-direct {v6, v9, v2, v12}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    iput-object v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    iput v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iput v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    const/4 v12, 0x4

    iput v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-static {v5, v6, v4}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_7

    goto/16 :goto_3

    :cond_7
    move-object v5, v1

    move v1, v8

    move-object v15, v9

    move-object v14, v10

    move-object v6, v11

    goto/16 :goto_2

    .line 25
    :goto_8
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    move-result-object v0

    const-string v8, "12"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 26
    iget-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    iget-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->C:Ljava/util/List;

    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    :try_start_b
    sget-object v8, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 27
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v8, "toString(...)"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    move-result-object v8

    move-object v13, v8

    new-instance v8, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v3, v16

    invoke-direct/range {v8 .. v13}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$2$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/util/List;Lvc/c;)V

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    iput v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    const/4 v12, 0x0

    iput v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    const/4 v12, 0x5

    iput v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-static {v3, v8, v4}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    if-ne v3, v7, :cond_8

    goto/16 :goto_3

    :cond_8
    move v3, v1

    move-object/from16 v20, v5

    move-object v13, v9

    move-object v1, v10

    move-object v5, v0

    move-object v9, v6

    move-object v6, v11

    const/4 v0, 0x0

    goto/16 :goto_1

    .line 29
    :goto_9
    :try_start_c
    invoke-static {v13, v8}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v10

    const-string v8, "listFilesInDir(...)"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/lang/Iterable;

    .line 30
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 31
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_9
    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljava/io/File;

    .line 32
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    move-result v12

    if-nez v12, :cond_9

    .line 33
    invoke-interface {v8, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 34
    :cond_a
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    move-object v11, v5

    move-object v12, v6

    move-object v6, v8

    move-object v5, v10

    move-object/from16 v23, v13

    move-object/from16 v32, v20

    move-object v8, v1

    move-object v10, v6

    move v1, v0

    const/4 v0, 0x0

    :goto_b
    :try_start_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v16, v13

    check-cast v16, Ljava/io/File;

    move-object/from16 p1, v6

    .line 35
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    .line 36
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    move-object/from16 v34, v8

    .line 37
    const-string v8, "screenshot.png"
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    move-object/from16 v35, v9

    const/4 v9, 0x1

    .line 38
    :try_start_e
    invoke-static {v6, v8, v9}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_b

    const/16 v29, 0x2

    goto :goto_e

    .line 39
    :cond_b
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v8
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    if-eqz v8, :cond_c

    :try_start_f
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    move-object/from16 v13, v23

    :goto_c
    move-object/from16 v20, v32

    move-object/from16 v9, v35

    goto/16 :goto_10

    :cond_c
    const/4 v8, 0x0

    :goto_d
    :try_start_10
    const-string v9, "image"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/16 v29, 0x0

    goto :goto_e

    :cond_d
    const/16 v29, 0x1

    .line 40
    :goto_e
    invoke-static {v12}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->j(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v8

    .line 41
    new-instance v20, Lcom/friday/common/entity/ResourceEntity;

    .line 42
    invoke-virtual {v11}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v22

    add-int/lit8 v24, v2, 0x1

    .line 43
    const-string v25, ""

    .line 44
    invoke-static/range {v16 .. v16}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/io/File;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v21, v6

    const-string v6, "getFileMD5ToString(...)"

    invoke-static {v9, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    sget-object v6, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    invoke-virtual {v6}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/friday/common/helper/b;->t()J

    move-result-wide v27

    const/16 v30, 0x1

    const/16 v31, 0x0

    move-object/from16 v33, v32

    move-object/from16 v26, v9

    .line 46
    invoke-direct/range {v20 .. v33}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    move-object/from16 v22, v13

    move-object/from16 v13, v20

    move-object/from16 v6, v23

    move-object/from16 v9, v32

    move-object/from16 v20, v10

    move/from16 v10, v29

    .line 47
    :try_start_11
    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    move-object/from16 v32, v9

    :try_start_12
    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->t:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    iput v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iput v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    iput v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->f:I

    const/4 v9, 0x0

    iput v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->g:I

    iput v10, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->h:I

    const/4 v9, 0x6

    iput v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-interface {v8, v13, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_e

    goto/16 :goto_3

    :cond_e
    move-object/from16 v23, v6

    move-object/from16 v10, v20

    move-object/from16 v8, v34

    move-object/from16 v9, v35

    move-object/from16 v6, p1

    goto/16 :goto_b

    :catchall_2
    move-exception v0

    :goto_f
    move-object v13, v6

    goto/16 :goto_c

    :catchall_3
    move-exception v0

    move-object/from16 v32, v9

    goto :goto_f

    :catchall_4
    move-exception v0

    move-object/from16 v6, v23

    goto :goto_f

    :catchall_5
    move-exception v0

    move-object/from16 v35, v9

    move-object/from16 v6, v23

    move-object v13, v6

    move-object/from16 v20, v32

    goto :goto_10

    :cond_f
    move-object/from16 v35, v9

    move-object/from16 v6, v23

    .line 48
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 49
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    move-object/from16 v23, v6

    move-object/from16 v9, v35

    goto :goto_11

    :catchall_6
    move-exception v0

    move v3, v1

    move-object/from16 v20, v5

    move-object v13, v9

    move-object v9, v6

    :goto_10
    :try_start_13
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v13

    move-object/from16 v32, v20

    .line 50
    :goto_11
    iget-object v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_11

    .line 51
    invoke-static/range {v23 .. v23}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 52
    const-string v0, "\u590d\u5236\u5931\u8d25"

    const/4 v12, 0x0

    new-array v6, v12, [Ljava/lang/Object;

    invoke-static {v0, v6}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    invoke-static {v1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->m(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    move-result-object v0

    invoke-static {v12}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static/range {v32 .. v32}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->t:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    iput v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    const/4 v12, 0x0

    iput v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    const/4 v2, 0x7

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-interface {v0, v1, v4}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_10

    goto/16 :goto_3

    .line 54
    :cond_10
    :goto_12
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    :cond_11
    invoke-static {v0}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    move v6, v2

    move-object v8, v14

    move-object v14, v7

    move v7, v3

    goto/16 :goto_1b

    .line 55
    :cond_12
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->j(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v0

    iget-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->C:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    iget-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    iget-object v10, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 56
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v3, v12}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move-object/from16 v31, v5

    move-object/from16 v22, v9

    move-object v13, v12

    const/4 v5, 0x0

    move-object v9, v8

    move-object v12, v11

    move-object v8, v3

    move-object v11, v6

    move-object v6, v8

    const/4 v3, 0x0

    :goto_13
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v19
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_0

    if-eqz v19, :cond_16

    :try_start_14
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v35

    .line 58
    move-object/from16 v19, v35

    check-cast v19, Lcom/friday/common/entity/ResourceEntity;

    .line 59
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v21

    add-int/lit8 v23, v2, 0x1

    .line 60
    invoke-virtual/range {v19 .. v19}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {v19 .. v19}, Lcom/friday/common/entity/ResourceEntity;->getFileId()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v26

    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v27, 0x0

    invoke-static/range {v24 .. v29}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v20
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_4

    move-object/from16 v24, v13

    const/4 v13, 0x4

    move-object/from16 v25, v10

    move-object v10, v14

    const/4 v14, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move-object/from16 p1, v6

    move-object/from16 v38, v7

    move-object/from16 v36, v8

    move-object/from16 v37, v15

    move-object/from16 v8, v24

    move-object/from16 v7, v25

    move-object/from16 v6, v26

    move-object v15, v9

    move-object/from16 v9, v20

    .line 61
    :try_start_15
    invoke-static/range {v9 .. v14}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    const/16 v33, 0x2f0

    const/16 v34, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x0

    move-object/from16 v32, v31

    .line 62
    invoke-static/range {v19 .. v34}, Lcom/friday/common/entity/ResourceEntity;->copy$default(Lcom/friday/common/entity/ResourceEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/friday/common/entity/ResourceEntity;

    move-result-object v9

    move-object/from16 v12, v22

    move-object/from16 v13, v31

    .line 63
    invoke-virtual {v9}, Lcom/friday/common/entity/ResourceEntity;->getResourceType()I

    move-result v14

    if-nez v14, :cond_15

    invoke-virtual {v9}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    move-result v14
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_2

    if-nez v14, :cond_15

    .line 64
    :try_start_16
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    move-result-object v14

    move-object/from16 v20, v14

    new-instance v14, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$4$result$1;

    move/from16 v21, v5

    const/4 v5, 0x0

    invoke-direct {v14, v9, v5}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1$4$result$1;-><init>(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)V

    iput-object v13, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static/range {v37 .. v37}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    iput-object v7, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    invoke-static/range {v36 .. v36}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->t:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->w:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->x:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->y:Ljava/lang/Object;

    iput v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    iput v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    move/from16 v5, v21

    iput v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->f:I

    move/from16 v21, v3

    const/4 v3, 0x0

    iput v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->g:I

    const/16 v3, 0x8

    iput v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    move-object/from16 v3, v20

    invoke-static {v3, v14, v4}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v14, v38

    if-ne v3, v14, :cond_13

    :goto_14
    move-object v5, v4

    goto/16 :goto_1e

    :cond_13
    move/from16 v20, v21

    move-object/from16 v21, p1

    move-object/from16 p1, v3

    move-object v3, v15

    move-object v15, v7

    move v7, v1

    move v1, v5

    move/from16 v5, v20

    move-object/from16 v20, v9

    move-object v9, v0

    move-object v0, v13

    move-object v13, v12

    move-object/from16 v12, v20

    move-object/from16 v38, v14

    const/16 v20, 0x0

    move-object v14, v8

    move-object v8, v6

    move v6, v2

    move-object v2, v8

    .line 65
    :goto_15
    move-object/from16 v22, p1

    check-cast v22, [F

    move/from16 v23, v1

    .line 66
    new-instance v1, Lcom/friday/common/entity/ImageSafetyEntity;

    move/from16 v24, v5

    .line 67
    invoke-virtual {v12}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v5

    const/16 v18, 0x1

    .line 68
    aget v25, v22, v18

    move/from16 v26, v6

    const/16 v6, 0x64

    int-to-float v6, v6

    mul-float v6, v6, v25

    float-to-int v6, v6

    .line 69
    invoke-direct {v1, v5, v6}, Lcom/friday/common/entity/ImageSafetyEntity;-><init>(Ljava/lang/String;I)V

    .line 70
    iput-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static/range {v37 .. v37}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    iput-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    invoke-static/range {v36 .. v36}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    iput-object v14, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->t:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->w:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->x:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->y:Ljava/lang/Object;

    iput v7, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    move/from16 v5, v26

    iput v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    move/from16 v6, v24

    iput v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->e:I

    move-object/from16 v19, v0

    move/from16 v0, v23

    iput v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->f:I

    move/from16 v23, v0

    move/from16 v0, v20

    iput v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->g:I

    const/16 v0, 0x9

    iput v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-static {v15, v1, v4}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->p(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_1

    move-object/from16 v1, v38

    if-ne v0, v1, :cond_14

    move-object v14, v1

    goto/16 :goto_14

    :cond_14
    move v0, v7

    move-object v7, v3

    move v3, v0

    move-object/from16 v20, v10

    move-object/from16 v22, v11

    move-object v10, v13

    move-object v13, v14

    move-object/from16 v0, v19

    move-object/from16 v11, v21

    move/from16 v19, v23

    move-object/from16 v21, v37

    move-object v14, v2

    move v2, v5

    move-object v5, v8

    move-object v8, v15

    move-object/from16 v15, v36

    :goto_16
    move-object/from16 v31, v14

    move-object v14, v1

    move v1, v3

    move v3, v6

    move-object v6, v11

    move-object/from16 v11, v22

    move-object/from16 v22, v10

    move-object v10, v8

    move-object v8, v15

    move-object v15, v7

    move-object/from16 v7, v31

    move-object/from16 v31, v0

    move-object v0, v9

    move-object v9, v12

    move-object v12, v5

    move/from16 v5, v19

    goto :goto_19

    :catch_1
    move-exception v0

    move-object/from16 v1, v38

    move-object v14, v1

    :goto_17
    move-object v5, v4

    goto/16 :goto_1d

    :cond_15
    move/from16 v21, v3

    move-object/from16 v14, v38

    goto :goto_18

    :catch_2
    move-exception v0

    move-object/from16 v14, v38

    goto :goto_17

    :goto_18
    move-object/from16 v20, v10

    move-object/from16 v22, v12

    move-object/from16 v31, v13

    move/from16 v3, v21

    move-object/from16 v21, v37

    move-object v12, v6

    move-object v10, v7

    move-object v13, v8

    move-object/from16 v8, v36

    move-object/from16 v6, p1

    move-object v7, v12

    .line 71
    :goto_19
    :try_start_17
    invoke-interface {v12, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v12, v7

    move-object v7, v14

    move-object v9, v15

    move-object/from16 v14, v20

    move-object/from16 v15, v21

    goto/16 :goto_13

    :catch_3
    move-exception v0

    goto :goto_17

    :catch_4
    move-exception v0

    move-object v14, v7

    goto :goto_17

    :cond_16
    move-object v6, v12

    move-object v10, v14

    move-object/from16 v37, v15

    move-object/from16 v12, v22

    move-object/from16 v13, v31

    move-object v14, v7

    .line 72
    move-object v3, v6

    check-cast v3, Ljava/util/List;

    .line 73
    iput-object v13, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static/range {v37 .. v37}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->t:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->w:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->x:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->y:Ljava/lang/Object;

    iput v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iput v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    const/16 v5, 0xa

    iput v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-interface {v0, v3, v4}, Lcom/friday/common/dao/ResourceDao;->x(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_17

    goto/16 :goto_14

    :cond_17
    move v0, v2

    move-object v3, v10

    move-object v6, v11

    move-object v2, v12

    move-object v8, v13

    move-object/from16 v5, v37

    .line 74
    :goto_1a
    sget-object v7, Lqc/q;->a:Lqc/q;

    move v7, v1

    move-object/from16 v23, v2

    move-object v15, v5

    move-object v9, v6

    move-object/from16 v32, v8

    move v6, v0

    move-object v8, v3

    :goto_1b
    iget-object v0, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    move-result-object v0

    .line 75
    iget-object v1, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v1

    .line 76
    iget-object v2, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->B:Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    move-result-object v2

    .line 77
    invoke-static/range {v32 .. v32}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 78
    invoke-static/range {v32 .. v32}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->t:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    iput v7, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iput v6, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    const/16 v3, 0xb

    iput v3, v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_3

    const/4 v3, 0x1

    move-object v5, v4

    move-object/from16 v4, v32

    :try_start_18
    invoke-interface/range {v0 .. v5}, Lcom/friday/common/dao/FileDao;->a0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_18

    goto/16 :goto_1e

    :cond_18
    move v0, v6

    move v1, v7

    move-object v3, v8

    move-object v6, v9

    move-object/from16 v2, v23

    move-object v8, v4

    .line 79
    :goto_1c
    iget-object v4, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    invoke-static {v4}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->m(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    move-result-object v4

    const/16 v18, 0x1

    invoke-static/range {v18 .. v18}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    iput v1, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->c:I

    iput v0, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->d:I

    const/16 v0, 0xc

    iput v0, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-interface {v4, v7, v5}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_5

    if-ne v0, v14, :cond_19

    goto :goto_1e

    :catch_5
    move-exception v0

    .line 80
    :goto_1d
    iget-object v1, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->A:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    invoke-static {v1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->m(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    move-result-object v1

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->i:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->j:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->k:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->l:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->m:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->n:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->o:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->p:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->q:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->r:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->s:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->t:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->u:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->v:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->w:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->x:Ljava/lang/Object;

    iput-object v12, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->y:Ljava/lang/Object;

    const/16 v0, 0xd

    iput v0, v5, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;->z:I

    invoke-interface {v1, v2, v5}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_19

    :goto_1e
    return-object v14

    .line 81
    :cond_19
    :goto_1f
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
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
