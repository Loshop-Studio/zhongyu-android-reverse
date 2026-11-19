.class final Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/RecycleBinViewModel;->K0(Ljava/util/List;)V
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
    c = "com.friday.document.viewmodel.RecycleBinViewModel$deleteDocument$1"
    f = "RecycleBinViewModel.kt"
    l = {
        0x73,
        0x75,
        0x78,
        0x79,
        0x7b,
        0x7c
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

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public final synthetic r:Lcom/friday/document/viewmodel/RecycleBinViewModel;

.field public final synthetic s:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Ljava/util/List;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->r:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->s:Ljava/util/List;

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
    new-instance p1, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->r:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->s:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Ljava/util/List;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v4, p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v7

    .line 1
    iget v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->q:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->o:I

    iget v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iget v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iget-object v3, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    check-cast v3, Lcom/friday/common/entity/FileEntity;

    iget-object v3, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iget-object v9, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    check-cast v9, Lcom/friday/common/entity/FileEntity;

    iget-object v10, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    iget-object v11, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    check-cast v12, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    iget-object v13, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    iget v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->p:I

    iget v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->o:I

    iget v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iget v3, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iget-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/FileEntity;

    iget-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->k:Ljava/lang/Object;

    iget-object v9, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v11, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    check-cast v11, Ljava/util/ArrayList;

    iget-object v12, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/entity/FileEntity;

    iget-object v13, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    iget-object v14, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    check-cast v14, Ljava/util/Iterator;

    iget-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    check-cast v15, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    iget-object v8, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v17, v8

    move-object/from16 v16, v10

    move v8, v1

    move v10, v3

    move-object v1, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v9

    move v9, v2

    goto/16 :goto_6

    :pswitch_2
    iget v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->o:I

    iget v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iget v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iget-object v3, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    check-cast v3, Lcom/friday/common/entity/FileEntity;

    iget-object v3, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iget-object v8, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    check-cast v8, Lcom/friday/common/entity/FileEntity;

    iget-object v9, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    iget-object v10, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    check-cast v11, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    iget-object v12, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_3
    iget v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->p:I

    iget v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->o:I

    iget v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iget v3, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iget-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/FileEntity;

    iget-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->k:Ljava/lang/Object;

    iget-object v8, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v10, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    check-cast v10, Ljava/util/ArrayList;

    iget-object v11, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    check-cast v11, Lcom/friday/common/entity/FileEntity;

    iget-object v12, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    iget-object v13, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    check-cast v14, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    iget-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move/from16 v16, v1

    move v1, v0

    move/from16 v0, v16

    move-object/from16 v16, v13

    move-object v13, v6

    move-object v6, v10

    move-object/from16 v10, v16

    move-object/from16 v16, v9

    move-object v9, v12

    move-object v12, v15

    goto/16 :goto_4

    :pswitch_4
    iget v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iget v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iget-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    iget-object v3, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    check-cast v3, Lcom/friday/common/entity/FileEntity;

    iget-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    iget-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    check-cast v8, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    iget-object v9, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->r:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    move-result-object v0

    iget-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->s:Ljava/util/List;

    const/4 v2, 0x1

    iput v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->q:I

    invoke-interface {v0, v1, v4}, Lcom/friday/common/dao/FileDao;->V(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    goto/16 :goto_7

    .line 3
    :cond_0
    :goto_0
    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->r:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v9, v0

    move-object v8, v1

    move-object v6, v2

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v3, v5

    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->k:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    iput v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    const/4 v1, 0x0

    iput v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    const/4 v1, 0x2

    iput v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->q:I

    invoke-static {v8, v3, v2, v4}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->E0(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_1

    goto/16 :goto_7

    :cond_1
    move v1, v0

    const/4 v0, 0x0

    .line 7
    :goto_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v11, v1

    move v1, v0

    move v0, v11

    move-object v11, v9

    move-object v12, v10

    move-object v9, v6

    move-object v10, v8

    move-object v6, v3

    move-object v8, v5

    move-object v3, v2

    move-object v5, v3

    const/4 v2, 0x0

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lcom/friday/common/entity/FileEntity;

    .line 8
    invoke-virtual {v14}, Lcom/friday/common/entity/FileEntity;->isSync()Z

    move-result v15

    if-eqz v15, :cond_4

    .line 9
    invoke-virtual {v10}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    move-result-object v15

    move-object/from16 p1, v3

    invoke-virtual {v14}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v5

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->k:Ljava/lang/Object;

    iput-object v14, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    iput v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iput v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iput v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->o:I

    const/4 v5, 0x0

    iput v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->p:I

    const/4 v5, 0x3

    iput v5, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->q:I

    invoke-interface {v15, v3, v4}, Lcom/friday/common/dao/FileDao;->M(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_2

    goto/16 :goto_7

    :cond_2
    move v3, v0

    move v0, v2

    move-object v5, v14

    move v2, v1

    move-object v14, v10

    const/4 v1, 0x0

    move-object v10, v9

    move-object v9, v8

    move-object v8, v12

    move-object v12, v11

    move-object v11, v6

    move-object/from16 v6, p1

    .line 10
    :goto_4
    invoke-virtual {v14}, Lcom/friday/document/viewmodel/BaseFileViewModel;->U()Lcom/friday/common/dao/ResourceDao;

    move-result-object v15

    move-object/from16 p1, v5

    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v17, v6

    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    iput-object v14, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->k:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    iput v3, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iput v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iput v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->o:I

    iput v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->p:I

    const/4 v1, 0x4

    iput v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->q:I

    invoke-interface {v15, v5, v4}, Lcom/friday/common/dao/ResourceDao;->q(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_3

    goto/16 :goto_7

    :cond_3
    move v1, v2

    move v2, v3

    move-object v3, v8

    move-object v8, v11

    move-object v11, v14

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    :goto_5
    move/from16 v19, v2

    move v2, v0

    move/from16 v0, v19

    move-object/from16 v19, v12

    move-object v12, v3

    move-object v3, v6

    move-object v6, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object/from16 v11, v19

    goto/16 :goto_9

    :cond_4
    move-object/from16 p1, v3

    move-object/from16 v16, v5

    .line 11
    invoke-virtual {v10}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    move-result-object v3

    invoke-virtual {v14}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->k:Ljava/lang/Object;

    iput-object v14, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    iput v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iput v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iput v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->o:I

    const/4 v15, 0x0

    iput v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->p:I

    const/4 v15, 0x5

    iput v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->q:I

    invoke-interface {v3, v5, v4}, Lcom/friday/common/dao/FileDao;->P(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_5

    goto/16 :goto_7

    :cond_5
    move-object v5, v13

    move-object v13, v6

    move-object v6, v5

    move-object v15, v9

    move-object/from16 v17, v11

    move-object v5, v14

    move-object/from16 v11, p1

    move v9, v1

    move-object v14, v8

    move-object v1, v10

    move v10, v0

    move v8, v2

    const/4 v0, 0x0

    .line 12
    :goto_6
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->U()Lcom/friday/common/dao/ResourceDao;

    move-result-object v2

    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v3

    move-object/from16 p1, v2

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->c:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->d:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->e:Ljava/lang/Object;

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->f:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->g:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->h:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->i:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->j:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->k:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->l:Ljava/lang/Object;

    iput v10, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->m:I

    iput v9, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->n:I

    iput v8, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->o:I

    iput v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->p:I

    const/4 v0, 0x6

    iput v0, v4, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;->q:I

    move-object v0, v1

    move-object v1, v3

    const-wide/16 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v18, v0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->U(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_6

    :goto_7
    return-object v7

    :cond_6
    move v0, v8

    move v1, v9

    move v2, v10

    move-object v6, v11

    move-object v3, v12

    move-object v9, v13

    move-object v10, v14

    move-object v11, v15

    move-object/from16 v5, v16

    move-object/from16 v13, v17

    move-object/from16 v12, v18

    :goto_8
    move v8, v2

    move v2, v0

    move v0, v8

    move-object v8, v10

    move-object v10, v12

    move-object v12, v3

    move-object v3, v6

    move-object v6, v9

    move-object v9, v11

    move-object v11, v13

    :goto_9
    move-object/from16 v4, p0

    goto/16 :goto_3

    :cond_7
    move-object/from16 v4, p0

    move-object v6, v9

    move-object v8, v10

    move-object v9, v11

    goto/16 :goto_1

    .line 13
    :cond_8
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
