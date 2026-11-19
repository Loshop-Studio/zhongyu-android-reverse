.class final Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NewNoteViewModel;->P(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.paint.viewmodel.NewNoteViewModel$handleResource$2"
    f = "NewNoteViewModel.kt"
    l = {
        0x143,
        0x153,
        0x167,
        0x168
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Ljava/lang/String;

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

.field public v:I

.field public w:I

.field public x:I

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lcom/friday/paint/viewmodel/NewNoteViewModel;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->y:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->z:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->A:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->y:Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->z:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->A:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;-><init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    move-object/from16 v4, p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v7

    .line 1
    iget v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->x:I

    const-string v8, "\u9875\u9762NewNoteViewModel.kt -> handleResource, \u66f4\u65b0\u6570\u636e\u5e93\uff0c["

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v12, 0x2

    const/4 v14, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v14, :cond_3

    if-eq v0, v12, :cond_2

    if-eq v0, v10, :cond_1

    if-ne v0, v9, :cond_0

    iget v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->u:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->t:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->s:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->r:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->q:I

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v15, Lcom/friday/common/entity/ResourceEntity;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iget-object v11, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v14, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v34, v6

    move-object/from16 v21, v8

    move-object v8, v14

    move v6, v2

    move v14, v3

    move/from16 v2, v17

    goto/16 :goto_9

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->v:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->u:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->t:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->s:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->r:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->q:I

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v11, Lcom/friday/common/entity/ResourceEntity;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    check-cast v13, Ljava/io/File;

    iget-object v14, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 p1, v20

    move-object/from16 v20, v13

    move-object/from16 v13, p1

    move-object/from16 v34, v9

    move-object/from16 v33, v11

    move-object/from16 v16, v12

    move-object/from16 v31, v14

    move-object v9, v15

    move-object/from16 v12, v19

    move-object/from16 v11, v21

    move-object/from16 p1, v22

    move v14, v5

    move v15, v6

    move-object/from16 v21, v8

    move-object v8, v10

    move v5, v2

    move v6, v3

    move/from16 v3, v17

    move-object/from16 v17, v18

    move v2, v1

    move-object v1, v0

    move-object/from16 v0, v23

    goto/16 :goto_7

    :cond_2
    iget v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->u:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->t:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->s:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->r:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->q:I

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v9, Lcom/friday/common/entity/ResourceEntity;

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v11, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v15, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v34, v6

    move-object/from16 v21, v8

    move-object v8, v15

    move v6, v2

    move v15, v5

    move/from16 v2, v17

    move v5, v1

    move-object v1, v0

    const/4 v0, 0x2

    goto/16 :goto_6

    :cond_3
    iget v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->v:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->u:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->t:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->s:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->r:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->q:I

    iget-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    check-cast v11, Ljava/io/File;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v14, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v31, v12

    move-object/from16 v12, v18

    move-object/from16 v29, v20

    move-object/from16 v32, v21

    move/from16 v21, v3

    move-object/from16 v20, v15

    move/from16 v3, v17

    move v15, v6

    move-object v6, v9

    move-object v9, v13

    move-object v13, v11

    move-object v11, v14

    move v14, v5

    move v5, v2

    move v2, v1

    move-object v1, v0

    move-object/from16 v0, v19

    goto/16 :goto_3

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->y:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->z:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    iget-object v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->A:Ljava/lang/String;

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v10, v5, 0x1

    if-gez v5, :cond_5

    invoke-static {}, Lrc/w;->w()V

    :cond_5
    move-object v11, v9

    check-cast v11, Ljava/lang/String;

    const/4 v12, 0x1

    .line 4
    invoke-static {v11, v12}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v13

    const-string v12, "listFilesInDir(...)"

    invoke-static {v13, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Iterable;

    .line 5
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_6
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_7

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Ljava/io/File;

    .line 7
    invoke-virtual {v15}, Ljava/io/File;->isDirectory()Z

    move-result v15

    if-nez v15, :cond_6

    .line 8
    invoke-interface {v12, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 9
    :cond_7
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move v15, v6

    move-object/from16 v17, v9

    move v14, v10

    move-object/from16 v18, v12

    move-object/from16 v19, v18

    move-object v9, v0

    move-object v10, v1

    move-object v12, v3

    move-object v1, v11

    move-object v0, v13

    const/4 v3, 0x0

    move-object v11, v2

    move v13, v5

    const/4 v2, 0x0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v5, v20

    check-cast v5, Ljava/io/File;

    .line 10
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    .line 11
    invoke-static {v10}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v21

    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    move-object/from16 p1, v9

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    iput v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->q:I

    iput v14, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->r:I

    iput v13, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->s:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->t:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->u:I

    const/4 v9, 0x0

    iput v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->v:I

    const/4 v9, 0x1

    iput v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->x:I

    move v9, v2

    move/from16 v22, v3

    const-wide/16 v2, 0x0

    move-object/from16 v23, v5

    const/4 v5, 0x2

    move-object/from16 v24, v1

    move-object v1, v6

    const/4 v6, 0x0

    move/from16 v35, v9

    move-object v9, v0

    move-object/from16 v0, v21

    move/from16 v21, v35

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_8

    goto/16 :goto_8

    :cond_8
    move-object/from16 v32, v10

    move-object/from16 v29, v11

    move-object/from16 v11, v18

    move-object/from16 v6, v19

    move-object/from16 v31, v20

    move/from16 v5, v21

    move/from16 v2, v22

    move-object/from16 v20, v24

    const/4 v3, 0x0

    move-object v10, v1

    move/from16 v21, v13

    move-object/from16 v13, v23

    move-object/from16 v1, p1

    move-object/from16 p1, v0

    move-object v0, v12

    move-object/from16 v12, v17

    .line 12
    :goto_3
    move-object/from16 v33, p1

    check-cast v33, Lcom/friday/common/entity/ResourceEntity;

    .line 13
    invoke-static {v13}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/io/File;)Ljava/lang/String;

    move-result-object v23

    if-nez v33, :cond_d

    .line 14
    invoke-static {v10}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    move-object/from16 p1, v1

    .line 15
    const-string v1, "screenshot.png"

    move-object/from16 v34, v6

    const/4 v6, 0x1

    .line 16
    invoke-static {v10, v1, v6}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v26, 0x2

    goto :goto_5

    .line 17
    :cond_9
    invoke-virtual {v13}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_a
    const/4 v1, 0x0

    :goto_4
    const-string v6, "image"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    const/16 v26, 0x0

    goto :goto_5

    :cond_b
    const/16 v26, 0x1

    .line 18
    :goto_5
    invoke-static/range {v32 .. v32}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v1

    .line 19
    new-instance v17, Lcom/friday/common/entity/ResourceEntity;

    .line 20
    invoke-virtual/range {v32 .. v32}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    move-result-object v19

    .line 21
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 22
    invoke-static/range {v32 .. v32}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->l(Lcom/friday/paint/viewmodel/NewNoteViewModel;)J

    move-result-wide v24

    const/16 v27, 0x1

    const/16 v28, 0x0

    .line 23
    const-string v22, ""

    move-object/from16 v30, v29

    move-object/from16 v18, v10

    invoke-direct/range {v17 .. v30}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v19, v18

    move/from16 v6, v21

    move-object/from16 v21, v8

    move-object/from16 v18, v12

    move-object/from16 v8, v17

    move-object/from16 v12, v29

    move-object/from16 v17, v11

    move-object/from16 v11, v20

    move-object/from16 v20, v13

    move/from16 v13, v26

    .line 24
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    move-object/from16 v10, v32

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    move-object/from16 v22, v0

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v33 .. v33}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    iput v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->q:I

    iput v14, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->r:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->s:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->t:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->u:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->v:I

    iput v13, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->w:I

    const/4 v0, 0x2

    iput v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->x:I

    invoke-interface {v1, v8, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_c

    goto/16 :goto_8

    :cond_c
    move-object/from16 v1, p1

    move-object v8, v10

    move v3, v14

    move-object/from16 v10, v17

    move-object/from16 v13, v22

    move-object v14, v12

    move-object/from16 v12, v18

    :goto_6
    move v0, v5

    move-object v5, v1

    move-object v1, v11

    move-object v11, v14

    move v14, v3

    move v3, v2

    move v2, v0

    move-object/from16 v18, v10

    move-object/from16 v17, v12

    move-object v12, v13

    move-object/from16 v0, v21

    move-object/from16 v19, v34

    move v13, v6

    move-object v10, v8

    goto/16 :goto_a

    :cond_d
    move-object/from16 v22, v0

    move-object/from16 p1, v1

    move-object/from16 v34, v6

    move-object/from16 v19, v10

    move-object/from16 v17, v11

    move-object/from16 v18, v12

    move-object/from16 v11, v20

    move/from16 v6, v21

    move-object/from16 v12, v29

    move-object/from16 v10, v32

    const/4 v0, 0x2

    move-object/from16 v21, v8

    move-object/from16 v20, v13

    .line 25
    invoke-virtual/range {v33 .. v33}, Lcom/friday/common/entity/ResourceEntity;->getMd5()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v8, v23

    invoke-static {v8, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v13, v21

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v0, v19

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "] \u6807\u8bb0\u672c\u5730\u6570\u636e\u5e93\u672a\u540c\u6b65\u72b6\u6001 start"

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 27
    invoke-static {v10}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v1

    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    move-object/from16 v13, v22

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    move-object/from16 v19, v10

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v33 .. v33}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    iput v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->q:I

    iput v14, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->r:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->s:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->t:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->u:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->v:I

    const/4 v10, 0x3

    iput v10, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->x:I

    invoke-interface {v1, v0, v4}, Lcom/friday/common/dao/ResourceDao;->D(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_e

    goto/16 :goto_8

    :cond_e
    move-object/from16 v1, p1

    move-object/from16 v16, v0

    move-object/from16 p1, v12

    move-object/from16 v0, v19

    move-object v12, v11

    move-object v11, v13

    move-object/from16 v13, v18

    .line 28
    :goto_7
    invoke-static {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v10

    .line 29
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 30
    invoke-static {v8}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 31
    invoke-static/range {p1 .. p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    move-object/from16 v18, v1

    .line 32
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    move-object/from16 v1, p1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    move-object/from16 p1, v0

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move-object/from16 v0, v16

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    move-object/from16 v16, v9

    invoke-static/range {v33 .. v33}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    iput v15, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->q:I

    iput v14, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->r:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->s:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->t:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->u:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->v:I

    const/4 v3, 0x4

    iput v3, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;->x:I

    invoke-interface {v10, v0, v8, v1, v4}, Lcom/friday/common/dao/ResourceDao;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_f

    :goto_8
    return-object v7

    :cond_f
    move-object v8, v1

    move v1, v5

    move v5, v15

    move-object/from16 v9, v16

    move-object/from16 v10, v17

    move-object v15, v0

    move-object/from16 v0, v18

    move-object/from16 v18, p1

    .line 33
    :goto_9
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 p1, v0

    move-object/from16 v0, v21

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "] \u6807\u8bb0\u672c\u5730\u6570\u636e\u5e93\u672a\u540c\u6b65\u72b6\u6001 end"

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    move-object/from16 v3, v18

    move-object/from16 v18, v10

    move-object v10, v3

    move v3, v2

    move v15, v5

    move-object/from16 v17, v13

    move-object/from16 v19, v34

    move-object/from16 v5, p1

    move v2, v1

    move v13, v6

    move-object v1, v12

    move-object v12, v11

    move-object v11, v8

    goto :goto_a

    :cond_10
    move-object/from16 v19, v10

    move-object/from16 v0, v21

    move-object/from16 v13, v22

    move-object/from16 v1, v18

    move-object/from16 v18, v17

    move-object/from16 v17, v1

    move v3, v2

    move v2, v5

    move-object v1, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v19, v34

    move-object/from16 v5, p1

    move v13, v6

    :goto_a
    move-object v8, v0

    move-object v0, v9

    move-object v9, v5

    goto/16 :goto_2

    :cond_11
    move-object/from16 p1, v9

    const/16 v16, 0x3

    move-object/from16 v0, p1

    move-object v1, v10

    move-object v2, v11

    move-object v3, v12

    move v5, v14

    move v6, v15

    goto/16 :goto_0

    .line 34
    :cond_12
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method
