.class final Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NoteViewModel;->N(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
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
    c = "com.friday.paint.viewmodel.NoteViewModel$handleResource$2"
    f = "NoteViewModel.kt"
    l = {
        0xec,
        0xf8,
        0x104,
        0x114,
        0x117,
        0x123,
        0x126,
        0x127,
        0x131,
        0x135,
        0x145,
        0x149,
        0x14a,
        0x157,
        0x159,
        0x15c,
        0x16e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public final synthetic C:Ljava/util/List;

.field public final synthetic D:Lcom/friday/paint/viewmodel/NoteViewModel;

.field public final synthetic E:Ljava/lang/String;

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

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->C:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->D:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->E:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->C:Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->D:Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->E:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;-><init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 48

    move-object/from16 v4, p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v7

    .line 1
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    const-string v8, "getName(...)"

    const-string v9, "header.bin"

    const-string v11, "thumbnail.jpg"

    const-string v14, "getAbsolutePath(...)"

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->z:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    check-cast v10, Lcom/friday/common/entity/ResourceEntity;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    check-cast v10, Ljava/io/File;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v27, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v35, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object v9, v14

    move-object v11, v7

    move-object v7, v13

    move-object/from16 v13, v20

    move-object/from16 v20, v22

    move-object/from16 v22, v19

    move-object/from16 v19, v26

    move/from16 v26, v17

    move-object/from16 v17, v18

    goto/16 :goto_18

    :pswitch_1
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->z:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/entity/ResourceEntity;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    check-cast v12, Ljava/io/File;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v27, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v35, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object/from16 v38, v14

    move-object/from16 v43, v18

    move-object/from16 v34, v21

    move-object/from16 v33, v22

    move-object/from16 v8, v23

    move-object/from16 v32, v24

    move-object/from16 v9, v26

    move-object v14, v7

    goto/16 :goto_17

    :pswitch_2
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->A:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->z:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    check-cast v13, Lcom/friday/common/entity/ResourceEntity;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    check-cast v15, Ljava/io/File;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v26, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v27, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v28, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v29, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v31, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v0

    move-object/from16 v0, p1

    move-object/from16 p1, v16

    move/from16 v16, v10

    move v10, v1

    move v1, v3

    move/from16 v3, v16

    move-object/from16 v35, v8

    move-object/from16 v37, v11

    move-object/from16 v40, v13

    move-object/from16 v38, v14

    move-object/from16 v41, v15

    move/from16 v14, v17

    move-object/from16 v39, v20

    move-object/from16 v42, v21

    move-object/from16 v43, v22

    move-object/from16 v36, v23

    move-object/from16 v13, v24

    move-object/from16 v34, v25

    move-object/from16 v33, v26

    move-object/from16 v20, v27

    move-object/from16 v32, v28

    move v15, v2

    move v2, v5

    move/from16 v21, v6

    move-object v11, v7

    move v5, v12

    move-object/from16 v6, v19

    move-object/from16 v12, v29

    move-object/from16 v29, v30

    move-object/from16 v7, v31

    move-object/from16 v31, v9

    move-object/from16 v9, v18

    :goto_0
    const/16 v16, 0x1

    goto/16 :goto_16

    :pswitch_3
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->A:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->z:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    check-cast v13, Ljava/io/File;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v27, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v28, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v29, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v30, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v31, v23

    move-object/from16 v23, v13

    move-object/from16 v13, v31

    move-object/from16 v31, v25

    move-object/from16 v25, v20

    move-object/from16 v20, v31

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object/from16 v38, v14

    move/from16 v11, v17

    move-object/from16 v8, v18

    move-object/from16 v17, v21

    move-object/from16 v21, v24

    move-object/from16 v9, v29

    move-object/from16 v18, v0

    move v14, v1

    move-object v1, v7

    move v0, v12

    move-object/from16 v24, v19

    move-object/from16 v12, v28

    move-object/from16 v7, v30

    move-object/from16 v19, p1

    move-object/from16 p1, v15

    move v15, v10

    move-object/from16 v10, v26

    goto/16 :goto_15

    :pswitch_4
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object/from16 v38, v14

    move-object/from16 v35, v15

    move-object v14, v7

    move-object v7, v12

    move-object v15, v13

    move v12, v3

    move v13, v5

    move-object/from16 v5, v19

    move v3, v1

    move/from16 v1, v17

    goto/16 :goto_13

    :pswitch_5
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/entity/ResourceEntity;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v13, Ljava/io/File;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v34, v0

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object v8, v13

    move-object/from16 v38, v14

    move-object/from16 v32, v15

    move-object/from16 v15, v21

    move-object/from16 v35, v22

    move-object/from16 v11, v23

    move-object/from16 v0, v25

    move v13, v6

    move-object v14, v7

    move-object v7, v10

    move-object/from16 v10, v18

    move v6, v3

    move-object/from16 v18, v12

    move v3, v2

    move v12, v5

    move/from16 v2, v17

    move-object/from16 v17, v19

    move-object/from16 v5, v24

    goto/16 :goto_12

    :pswitch_6
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/entity/ResourceEntity;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v13, Ljava/io/File;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v34, v0

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object v8, v13

    move-object/from16 v38, v14

    move-object/from16 v32, v15

    move-object/from16 v15, v21

    move-object/from16 v35, v22

    move-object/from16 v11, v23

    move-object/from16 v0, v25

    move v13, v6

    move-object v14, v7

    move-object v7, v10

    move-object/from16 v10, v18

    move v6, v1

    move-object/from16 v18, v12

    move/from16 v1, v17

    move-object/from16 v17, v19

    move v12, v5

    move-object/from16 v5, v24

    goto/16 :goto_11

    :pswitch_7
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object/from16 v38, v14

    move-object/from16 v35, v15

    move v9, v1

    move-object v14, v7

    move-object v15, v13

    move-object/from16 v1, v20

    move v13, v5

    move-object/from16 v5, v19

    goto/16 :goto_10

    :pswitch_8
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v10, Ljava/io/File;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v34, v0

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v32, v12

    move-object v8, v14

    move/from16 v0, v17

    move-object/from16 v29, v22

    move-object/from16 v17, p1

    move v9, v2

    move v12, v5

    move-object v14, v7

    move-object/from16 p1, v10

    move-object v7, v11

    move-object v10, v13

    move-object/from16 v5, v18

    move-object/from16 v11, v21

    move/from16 v21, v3

    move v13, v6

    move-object/from16 v3, v20

    move v6, v1

    move-object/from16 v20, v19

    :goto_1
    move-object/from16 v1, v23

    goto/16 :goto_f

    :pswitch_9
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v32, v11

    move-object/from16 v37, v14

    move v8, v1

    move-object v14, v7

    move/from16 v1, v17

    goto/16 :goto_c

    :pswitch_a
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/entity/ResourceEntity;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v13, Ljava/io/File;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v35, v0

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object v9, v10

    move-object/from16 v32, v11

    move-object/from16 v37, v14

    move-object/from16 v34, v15

    move-object/from16 v10, v18

    move-object/from16 v15, v21

    move-object/from16 v11, v23

    move-object/from16 v0, v25

    move v8, v2

    move-object v14, v7

    move-object/from16 v18, v12

    move/from16 v2, v17

    move-object/from16 v17, v19

    move v12, v6

    move-object/from16 v6, v24

    goto/16 :goto_b

    :pswitch_b
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/entity/ResourceEntity;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v13, Ljava/io/File;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v31, v7

    move v7, v1

    move-object/from16 v1, v31

    move-object/from16 v35, v0

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object v9, v10

    move-object/from16 v32, v11

    move-object/from16 v37, v14

    move-object/from16 v34, v15

    move-object/from16 v10, v18

    move-object/from16 v15, v21

    move-object/from16 v11, v23

    move-object/from16 v0, v25

    move v8, v2

    move-object/from16 v18, v12

    move/from16 v2, v17

    move-object/from16 v17, v19

    move v12, v6

    move-object/from16 v6, v24

    goto/16 :goto_9

    :pswitch_c
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v32, v11

    move-object/from16 v37, v14

    move v8, v1

    move v9, v3

    move-object v1, v7

    move v3, v2

    move-object/from16 v2, v20

    goto/16 :goto_8

    :pswitch_d
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    check-cast v10, Ljava/io/File;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    check-cast v13, Ljava/util/Iterator;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v18, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    move-object/from16 v20, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v21, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v29, v7

    move v7, v1

    move-object/from16 v1, v29

    move-object/from16 v29, v13

    move-object v13, v10

    move-object/from16 v10, v29

    move-object/from16 v35, v0

    move-object/from16 v33, v8

    move-object/from16 v31, v9

    move-object/from16 v32, v11

    move-object/from16 v34, v12

    move/from16 v0, v17

    move-object/from16 v11, v21

    move-object/from16 v29, v22

    move v8, v2

    move/from16 v21, v3

    move v9, v5

    move v12, v6

    move-object/from16 v6, v18

    move-object/from16 v5, v20

    move-object/from16 v20, v19

    :goto_2
    move-object/from16 v2, v23

    goto/16 :goto_7

    :pswitch_e
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v6, Lcom/friday/paint/viewmodel/NoteViewModel;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v32, v14

    move-object v14, v9

    move-object/from16 v9, v32

    move-object/from16 v35, v8

    move-object/from16 v32, v11

    move-object v11, v7

    goto/16 :goto_1f

    :pswitch_f
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v15, Lcom/friday/paint/viewmodel/NoteViewModel;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move/from16 v21, v1

    move v1, v3

    move-object/from16 v35, v8

    move-object/from16 v31, v9

    move-object v8, v11

    move-object v3, v12

    move-object/from16 v29, v13

    move-object v9, v14

    move-object v11, v7

    move-object v12, v10

    move-object v7, v0

    move v0, v2

    move-object v10, v6

    move/from16 v2, v17

    const/4 v6, 0x2

    goto/16 :goto_1d

    :pswitch_10
    iget v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iget v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iget v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iget v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iget-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iget-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    check-cast v15, Lcom/friday/paint/viewmodel/NoteViewModel;

    move/from16 v17, v0

    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move/from16 v21, v1

    move-object/from16 v35, v8

    move-object/from16 v31, v9

    move-object v8, v11

    move-object v9, v14

    move-object v1, v0

    move-object v11, v7

    move-object v7, v10

    const/4 v0, 0x1

    move-object v10, v6

    move-object v6, v5

    move v5, v3

    move v3, v2

    move/from16 v2, v17

    :goto_3
    move-object/from16 v29, v13

    goto/16 :goto_1c

    :pswitch_11
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->C:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->D:Lcom/friday/paint/viewmodel/NoteViewModel;

    iget-object v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->E:Ljava/lang/String;

    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v15, v1

    move-object/from16 v29, v2

    move-object v12, v3

    const/4 v3, 0x0

    const/16 v21, 0x0

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v21, 0x1

    if-gez v21, :cond_0

    invoke-static {}, Lrc/w;->w()V

    :cond_0
    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    .line 4
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    .line 5
    move-object v10, v6

    check-cast v10, Ljava/util/Collection;

    if-eqz v10, :cond_1

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_2

    :cond_1
    move-object/from16 v35, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object v9, v14

    move-object v11, v7

    goto/16 :goto_1b

    .line 6
    :cond_2
    move-object v10, v6

    check-cast v10, Ljava/lang/Iterable;

    .line 7
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move-object/from16 p1, v13

    move-object v13, v5

    move-object/from16 v5, p1

    move-object/from16 p1, v0

    move-object/from16 v19, v1

    move v0, v2

    move v1, v3

    move-object/from16 v17, v6

    move-object/from16 v18, v10

    move-object v3, v12

    move-object v6, v15

    move/from16 v2, v21

    move-object/from16 v12, v29

    const/4 v10, 0x0

    const/4 v15, 0x0

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_1b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v31, v9

    move-object/from16 v9, v20

    check-cast v9, Ljava/io/File;

    move-object/from16 v32, v11

    .line 8
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v33, v8

    const-string v8, ".bin"

    move-object/from16 v34, v7

    move/from16 v22, v10

    move/from16 v21, v15

    const/4 v7, 0x2

    const/4 v10, 0x0

    const/4 v15, 0x0

    invoke-static {v11, v8, v15, v7, v10}, Lqd/z;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 9
    invoke-static {v6}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v7

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    const/4 v10, 0x0

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    iput v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    move/from16 v10, v22

    iput v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    move/from16 v11, v21

    iput v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    const/4 v15, 0x0

    iput v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    const/4 v15, 0x4

    iput v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    move/from16 v21, v2

    move-object v15, v3

    const-wide/16 v2, 0x0

    move-object/from16 v22, v5

    const/4 v5, 0x2

    move-object/from16 v23, v6

    const/4 v6, 0x0

    move-object/from16 v47, v7

    move v7, v0

    move-object/from16 v0, v47

    move-object/from16 v47, v8

    move v8, v1

    move-object/from16 v1, v47

    move-object/from16 v47, v22

    move/from16 v22, v10

    move-object/from16 v10, v47

    move/from16 v47, v21

    move/from16 v21, v11

    move-object v11, v15

    move/from16 v15, v47

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v34

    if-ne v0, v1, :cond_3

    :goto_6
    move-object v11, v1

    goto/16 :goto_1e

    :cond_3
    move-object/from16 v35, p1

    move-object/from16 p1, v0

    move-object/from16 v29, v12

    move-object/from16 v6, v17

    move-object/from16 v5, v19

    move-object/from16 v34, v20

    const/4 v0, 0x0

    move v12, v8

    move-object/from16 v20, v13

    move/from16 v8, v22

    move-object v13, v9

    move v9, v7

    move/from16 v7, v21

    move/from16 v21, v15

    move-object/from16 v15, v18

    goto/16 :goto_2

    .line 10
    :goto_7
    move-object/from16 v3, p1

    check-cast v3, Lcom/friday/common/entity/ResourceEntity;

    .line 11
    invoke-static {v13}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/io/File;)Ljava/lang/String;

    move-result-object v23

    if-nez v3, :cond_5

    move-object/from16 p1, v5

    .line 12
    invoke-static {v2}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v5

    .line 13
    new-instance v17, Lcom/friday/common/entity/ResourceEntity;

    move-object/from16 v36, v6

    .line 14
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    move-result-object v19

    .line 16
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/friday/paint/viewmodel/NoteViewModel;->j(Lcom/friday/paint/viewmodel/NoteViewModel;)J

    move-result-wide v24

    const/16 v27, 0x1

    const/16 v28, 0x0

    .line 17
    const-string v22, ""

    const/16 v26, 0x1

    move-object/from16 v30, v29

    move-object/from16 v18, v6

    invoke-direct/range {v17 .. v30}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v18, v3

    move-object/from16 v19, v13

    move-object/from16 v37, v14

    move-object/from16 v13, v17

    move/from16 v3, v21

    move-object/from16 v6, v29

    move-object/from16 v17, v15

    move-object/from16 v15, v20

    .line 18
    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v36 .. v36}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    const/4 v0, 0x5

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v5, v13, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    goto/16 :goto_6

    :cond_4
    move-object/from16 v19, v6

    move-object v6, v10

    move-object/from16 v18, v11

    move v5, v12

    move-object v13, v15

    move-object/from16 v10, v17

    move-object/from16 v0, v35

    move-object/from16 v12, v36

    move-object/from16 v15, p1

    move/from16 v17, v7

    :goto_8
    move/from16 v11, v17

    move-object/from16 v17, v12

    move-object/from16 v12, v19

    move-object/from16 v19, v15

    move v15, v11

    move-object v11, v1

    move v1, v5

    move-object v5, v6

    move-object/from16 v21, v10

    move-object/from16 v35, v33

    move-object v6, v2

    move v2, v3

    move v10, v8

    move v3, v9

    move-object/from16 v9, v37

    move-object/from16 v37, v32

    goto/16 :goto_1a

    :cond_5
    move-object/from16 v18, v3

    move-object/from16 p1, v5

    move-object/from16 v36, v6

    move-object/from16 v19, v13

    move-object/from16 v37, v14

    move-object/from16 v17, v15

    move-object/from16 v15, v20

    move/from16 v3, v21

    move-object/from16 v6, v29

    .line 19
    invoke-static {v2}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v5

    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v36 .. v36}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move-object/from16 v14, v19

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    move-object/from16 v19, v2

    move-object/from16 v2, v18

    iput-object v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    move-object/from16 v2, v23

    iput-object v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    move/from16 v20, v0

    const/4 v0, 0x6

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v5, v13, v3, v4}, Lcom/friday/common/dao/ResourceDao;->W(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    goto/16 :goto_6

    :cond_6
    move-object/from16 v22, p1

    move v5, v9

    move-object v13, v14

    move-object/from16 v0, v19

    move-object v9, v2

    move/from16 v2, v20

    move-object/from16 v20, v36

    .line 20
    :goto_9
    invoke-virtual/range {v18 .. v18}, Lcom/friday/common/entity/ResourceEntity;->getMd5()Ljava/lang/String;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    .line 21
    invoke-static {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v14

    move-object/from16 v24, v1

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    move-object/from16 p1, v14

    move-object/from16 v14, v37

    invoke-static {v1, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    const/4 v14, 0x7

    iput v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    move-object/from16 v14, p1

    invoke-interface {v14, v1, v4}, Lcom/friday/common/dao/ResourceDao;->D(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v14, v24

    if-ne v1, v14, :cond_7

    :goto_a
    move-object v11, v14

    goto/16 :goto_1e

    :cond_7
    move v1, v7

    .line 22
    :goto_b
    invoke-static {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v7

    move-object/from16 p1, v13

    .line 23
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v24, v14

    move-object/from16 v14, v37

    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 25
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 26
    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    const/16 v2, 0x8

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v7, v13, v9, v6, v4}, Lcom/friday/common/dao/ResourceDao;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v14, v24

    if-ne v2, v14, :cond_8

    goto :goto_a

    :cond_8
    move v2, v3

    move v3, v5

    move-object/from16 v19, v6

    move-object v6, v10

    move-object/from16 v18, v11

    move v5, v12

    move-object v13, v15

    move-object/from16 v10, v17

    move-object/from16 v12, v20

    move-object/from16 v15, v22

    move-object/from16 v20, v0

    move-object/from16 v0, v35

    :goto_c
    move-object/from16 v21, v10

    move-object/from16 v17, v12

    move-object v11, v14

    move-object/from16 v12, v19

    move-object/from16 v35, v33

    move-object/from16 v9, v37

    move v10, v8

    move-object/from16 v19, v15

    move-object/from16 v37, v32

    move v15, v1

    move v1, v5

    :goto_d
    move-object v5, v6

    move-object/from16 v6, v20

    goto/16 :goto_1a

    :cond_9
    move v2, v3

    move v3, v5

    move-object v5, v10

    move-object/from16 v18, v11

    move-object v13, v15

    move-object/from16 v21, v17

    move-object/from16 v17, v20

    move-object/from16 v19, v22

    move-object/from16 v9, v37

    move-object v11, v1

    move v15, v7

    move v10, v8

    move v1, v12

    move-object/from16 v37, v32

    move-object v12, v6

    move-object v6, v0

    move-object/from16 v0, v35

    move-object/from16 v35, v33

    goto/16 :goto_1a

    :cond_a
    move v7, v0

    move v8, v1

    move v15, v2

    move-object v11, v3

    move-object v10, v5

    move-object/from16 v23, v6

    move-object/from16 v37, v14

    move-object/from16 v14, v34

    .line 27
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v32

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lqd/z;->C(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 28
    invoke-static/range {v23 .. v23}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v0

    move-object/from16 v32, v1

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v37

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    move-object/from16 v3, v23

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    iput v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    move/from16 v5, v22

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    move/from16 v6, v21

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    move-object/from16 v21, v0

    const/4 v0, 0x0

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    const/16 v0, 0x9

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    const-wide/16 v2, 0x0

    const/4 v5, 0x2

    move v0, v6

    const/4 v6, 0x0

    move-object/from16 v24, v21

    move/from16 v21, v0

    move-object/from16 v0, v24

    move/from16 v24, v7

    move/from16 v25, v8

    move-object/from16 v7, v32

    move-object/from16 v8, v37

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_b

    :goto_e
    goto/16 :goto_a

    :cond_b
    move-object/from16 v34, p1

    move-object/from16 p1, v9

    move-object/from16 v29, v12

    move-object/from16 v5, v17

    move-object/from16 v3, v19

    move-object/from16 v32, v20

    move/from16 v6, v21

    move/from16 v9, v22

    move/from16 v12, v24

    move-object/from16 v17, v0

    move-object/from16 v20, v13

    move/from16 v21, v15

    move-object/from16 v15, v18

    move/from16 v13, v25

    const/4 v0, 0x0

    goto/16 :goto_1

    .line 29
    :goto_f
    move-object/from16 v2, v17

    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 30
    invoke-static/range {p1 .. p1}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/io/File;)Ljava/lang/String;

    move-result-object v23

    if-nez v2, :cond_d

    move-object/from16 v35, v3

    .line 31
    invoke-static {v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v3

    .line 32
    new-instance v17, Lcom/friday/common/entity/ResourceEntity;

    move-object/from16 v36, v5

    .line 33
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    move-result-object v19

    .line 35
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 36
    invoke-static {v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->j(Lcom/friday/paint/viewmodel/NoteViewModel;)J

    move-result-wide v24

    const/16 v27, 0x1

    const/16 v28, 0x0

    .line 37
    const-string v22, ""

    const/16 v26, 0x2

    move-object/from16 v30, v29

    move-object/from16 v18, v5

    invoke-direct/range {v17 .. v30}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v18, v2

    move-object/from16 v37, v7

    move-object/from16 v38, v8

    move-object/from16 v2, v17

    move/from16 v7, v21

    move-object/from16 v5, v29

    move-object/from16 v17, v15

    move-object/from16 v15, v20

    .line 38
    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v36 .. v36}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v32 .. v32}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    const/16 v0, 0xa

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v3, v2, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_c

    goto/16 :goto_a

    :cond_c
    move-object/from16 v0, v17

    move/from16 v17, v6

    move-object v6, v10

    move-object v10, v0

    move v2, v7

    move-object/from16 v18, v11

    move v3, v12

    move-object/from16 v0, v34

    move-object/from16 v12, v36

    :goto_10
    move-object v11, v6

    move-object v6, v1

    move v1, v13

    move-object v13, v15

    move/from16 v15, v17

    move-object/from16 v17, v12

    move-object v12, v5

    move-object v5, v11

    move-object/from16 v21, v10

    move-object v11, v14

    move-object/from16 v19, v35

    move v10, v9

    move-object/from16 v35, v33

    move-object/from16 v9, v38

    goto/16 :goto_1a

    :cond_d
    move-object/from16 v18, v2

    move-object/from16 v35, v3

    move-object/from16 v36, v5

    move-object/from16 v37, v7

    move-object/from16 v38, v8

    move-object/from16 v17, v15

    move-object/from16 v15, v20

    move/from16 v7, v21

    move-object/from16 v5, v29

    .line 39
    invoke-static {v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v36 .. v36}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v32 .. v32}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    move-object/from16 v8, p1

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    move-object/from16 p1, v1

    move-object/from16 v1, v18

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    move-object/from16 v1, v23

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    move/from16 v19, v0

    const/16 v0, 0xb

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v2, v3, v7, v4}, Lcom/friday/common/dao/ResourceDao;->W(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_e

    goto/16 :goto_e

    :cond_e
    move-object/from16 v0, p1

    move v3, v7

    move v2, v9

    move-object/from16 v20, v36

    move-object v7, v1

    move/from16 v1, v19

    .line 40
    :goto_11
    invoke-virtual/range {v18 .. v18}, Lcom/friday/common/entity/ResourceEntity;->getMd5()Ljava/lang/String;

    .line 41
    invoke-virtual/range {v18 .. v18}, Lcom/friday/common/entity/ResourceEntity;->getMd5()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    .line 42
    invoke-static {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v9

    move-object/from16 v36, v14

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v14

    move-object/from16 p1, v9

    move-object/from16 v9, v38

    invoke-static {v14, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v32 .. v32}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    iput-object v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    const/16 v9, 0xc

    iput v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    move-object/from16 v9, p1

    invoke-interface {v9, v14, v4}, Lcom/friday/common/dao/ResourceDao;->D(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v14, v36

    if-ne v9, v14, :cond_f

    goto/16 :goto_a

    :cond_f
    move/from16 v47, v2

    move v2, v1

    move v1, v6

    move v6, v3

    move/from16 v3, v47

    .line 43
    :goto_12
    invoke-static {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v9

    move-object/from16 p1, v8

    .line 44
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v36, v14

    move-object/from16 v14, v38

    invoke-static {v8, v14}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 46
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 47
    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v35 .. v35}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v32 .. v32}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    const/16 v2, 0xd

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v9, v8, v7, v5, v4}, Lcom/friday/common/dao/ResourceDao;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v14, v36

    if-ne v2, v14, :cond_10

    goto/16 :goto_a

    :cond_10
    move v2, v6

    move-object v6, v10

    move-object/from16 v18, v11

    move-object/from16 v10, v17

    move-object/from16 v7, v20

    move-object/from16 v20, v0

    move-object/from16 v0, v34

    :goto_13
    move-object v9, v15

    move v15, v1

    move v1, v13

    move-object v13, v9

    move-object/from16 v17, v7

    move-object/from16 v21, v10

    move-object v11, v14

    move-object/from16 v19, v35

    move-object/from16 v9, v38

    move v10, v3

    move v3, v12

    move-object/from16 v35, v33

    move-object v12, v5

    goto/16 :goto_d

    :cond_11
    move-object v1, v10

    move v10, v2

    move v2, v3

    move v3, v12

    move-object v12, v5

    move-object v5, v1

    move-object/from16 v18, v11

    move v1, v13

    move-object v11, v14

    move-object v13, v15

    move-object/from16 v21, v17

    move-object/from16 v17, v20

    move-object/from16 v19, v35

    move-object/from16 v9, v38

    move v15, v6

    move-object/from16 v35, v33

    move-object v6, v0

    move-object/from16 v0, v34

    goto/16 :goto_1a

    :cond_12
    move/from16 v24, v7

    move/from16 v25, v8

    move-object v0, v9

    move-object/from16 v38, v37

    move-object/from16 v37, v1

    .line 48
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "res"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 49
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    move-result-object v1

    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    .line 51
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v5, v10

    move-object v10, v2

    move-object v2, v12

    move-object v12, v11

    move-object v11, v3

    move-object v3, v13

    move-object v13, v5

    move/from16 v5, v21

    move/from16 v7, v24

    move/from16 v9, v25

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v21, v18

    move-object/from16 v18, p1

    move-object/from16 p1, v1

    move/from16 v1, v22

    move-object/from16 v22, v20

    move-object/from16 v20, v17

    move-object/from16 v17, v0

    move-object/from16 v0, v23

    :goto_14
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_19

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v24, v10

    move-object/from16 v10, v23

    check-cast v10, Ljava/io/File;

    .line 52
    invoke-static {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v25

    move-object/from16 v34, v14

    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v14

    move/from16 v26, v8

    move-object/from16 v8, v38

    invoke-static {v14, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v27, v14

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput-object v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    const/4 v14, 0x0

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    iput v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    move/from16 v14, v26

    iput v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->z:I

    move-object/from16 v26, v0

    const/4 v0, 0x0

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->A:I

    const/16 v0, 0xe

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    move-object v0, v2

    move-object/from16 v28, v3

    const-wide/16 v2, 0x0

    move/from16 v29, v5

    const/4 v5, 0x2

    move/from16 v30, v6

    const/4 v6, 0x0

    move-object/from16 v47, v25

    move-object/from16 v25, v0

    move-object/from16 v0, v47

    move-object/from16 v47, v27

    move/from16 v27, v1

    move-object/from16 v1, v47

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v34

    if-ne v0, v1, :cond_13

    goto/16 :goto_6

    :cond_13
    move-object/from16 v38, v8

    move-object v8, v11

    move v6, v15

    move/from16 v5, v27

    move/from16 v3, v29

    move/from16 v2, v30

    const/4 v11, 0x0

    move v15, v7

    move-object/from16 v27, v19

    move-object/from16 v7, v26

    move-object/from16 v19, v0

    move v0, v9

    move-object/from16 v9, v25

    move-object/from16 v25, p1

    move-object/from16 p1, v23

    move-object/from16 v23, v10

    move-object/from16 v10, v28

    .line 53
    :goto_15
    check-cast v19, Lcom/friday/common/entity/ResourceEntity;

    if-nez v19, :cond_17

    .line 54
    invoke-static {v7}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v26

    move-object/from16 v34, v1

    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    move/from16 v28, v11

    move-object/from16 v11, v33

    invoke-static {v1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v29, v1

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v27 .. v27}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    move-object/from16 v1, v23

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iput v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->z:I

    move/from16 v1, v28

    iput v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->A:I

    move/from16 v28, v0

    const/16 v0, 0xf

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    move/from16 v30, v2

    move v0, v3

    const-wide/16 v2, 0x0

    move/from16 v32, v5

    const/4 v5, 0x2

    move/from16 v33, v6

    const/4 v6, 0x0

    move/from16 v40, v0

    move/from16 v42, v1

    move-object/from16 v35, v11

    move-object/from16 v0, v26

    move-object/from16 v1, v29

    move/from16 v41, v30

    move/from16 v39, v32

    move-object/from16 v11, v34

    move/from16 v26, v14

    move/from16 v14, v28

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->t(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_14

    goto/16 :goto_1e

    :cond_14
    move-object v6, v8

    move-object/from16 v29, v9

    move v5, v14

    move v3, v15

    move-object/from16 v43, v17

    move-object/from16 v34, v21

    move-object/from16 v36, v22

    move-object/from16 v32, v27

    move/from16 v21, v33

    move/from16 v2, v39

    move/from16 v1, v40

    move/from16 v15, v41

    move/from16 v14, v42

    move-object/from16 v9, p1

    move-object/from16 p1, v18

    move-object/from16 v40, v19

    move-object/from16 v33, v20

    move-object/from16 v41, v23

    move-object/from16 v39, v24

    move-object/from16 v42, v25

    move-object/from16 v20, v10

    move/from16 v10, v26

    goto/16 :goto_0

    :goto_16
    invoke-static/range {v16 .. v16}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 55
    invoke-static/range {v41 .. v41}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    move-result v0

    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-object/from16 v18, p1

    move-object v0, v7

    move v8, v10

    move-object/from16 v25, v12

    move-object/from16 v19, v32

    move-object/from16 v22, v36

    move-object/from16 v9, v38

    move-object/from16 v17, v43

    move v7, v3

    move v10, v5

    move-object v12, v6

    move v6, v15

    move-object/from16 v3, v20

    move-object/from16 v20, v33

    move-object/from16 v15, v42

    move v5, v1

    move v1, v2

    move-object/from16 v2, v29

    goto/16 :goto_19

    .line 56
    :cond_15
    invoke-static {v7}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v0

    .line 57
    new-instance v17, Lcom/friday/common/entity/ResourceEntity;

    .line 58
    invoke-virtual/range {v41 .. v41}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v44, v9

    move-object/from16 v9, v38

    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {v7}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v18, v8

    .line 60
    invoke-static/range {v41 .. v41}, Lcom/blankj/utilcode/util/FileUtils;->getFileMD5ToString(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "getFileMD5ToString(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-static {v7}, Lcom/friday/paint/viewmodel/NoteViewModel;->j(Lcom/friday/paint/viewmodel/NoteViewModel;)J

    move-result-wide v24

    const/16 v27, 0x1

    const/16 v28, 0x0

    .line 62
    const-string v22, ""

    const/16 v26, 0x0

    move-object/from16 v30, v29

    move-object/from16 v23, v8

    invoke-direct/range {v17 .. v30}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v45, v11

    move-object/from16 v46, v17

    move-object/from16 v8, v20

    move/from16 v11, v21

    move-object/from16 v9, v29

    move-object/from16 v17, v0

    .line 63
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v32 .. v32}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v33 .. v33}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v34 .. v34}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v36 .. v36}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {v43 .. v43}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v42 .. v42}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static/range {v39 .. v39}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    invoke-static/range {v44 .. v44}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    invoke-static/range {v41 .. v41}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    invoke-static/range {v40 .. v40}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v11, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    iput v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    iput v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    iput v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->z:I

    iput v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->A:I

    const/16 v0, 0x10

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    move-object/from16 v0, v17

    move-object/from16 v14, v46

    invoke-interface {v0, v14, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v14, v45

    if-ne v0, v14, :cond_16

    goto/16 :goto_a

    :cond_16
    move-object/from16 v0, p1

    move-object/from16 v27, v7

    move/from16 v17, v10

    move-object/from16 v25, v12

    move-object/from16 v20, v13

    move-object/from16 v19, v36

    move-object/from16 v13, v39

    move v10, v5

    move-object v12, v6

    move v5, v11

    move v6, v3

    move v3, v2

    move v2, v1

    move v1, v15

    move-object/from16 v15, v42

    :goto_17
    sget-object v7, Lqc/q;->a:Lqc/q;

    move-object/from16 v18, v0

    move/from16 v21, v5

    move v7, v6

    move-object/from16 v39, v13

    move-object v11, v14

    move-object/from16 v22, v19

    move-object/from16 v13, v20

    move-object/from16 v0, v27

    move-object/from16 v19, v32

    move-object/from16 v20, v33

    move v6, v1

    move v5, v2

    move v1, v3

    move-object v3, v8

    move-object v2, v9

    move/from16 v8, v17

    move-object/from16 v9, v38

    move-object/from16 v17, v43

    goto/16 :goto_19

    :cond_17
    move/from16 v41, v2

    move/from16 v40, v3

    move/from16 v39, v5

    move/from16 v42, v11

    move/from16 v26, v14

    move-object/from16 v35, v33

    move v14, v0

    move-object v11, v1

    move/from16 v33, v6

    move-object v0, v9

    .line 64
    invoke-static {v7}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v1

    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v9, v38

    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v7, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static/range {v27 .. v27}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    invoke-static/range {v24 .. v24}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    iput v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    move/from16 v3, v40

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->x:I

    move-object/from16 v19, v0

    move/from16 v0, v41

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->y:I

    move/from16 v30, v0

    move/from16 v0, v26

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->z:I

    move/from16 v0, v42

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->A:I

    const/16 v0, 0x11

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v1, v2, v6, v4}, Lcom/friday/common/dao/ResourceDao;->W(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_18

    goto/16 :goto_1e

    :cond_18
    move-object/from16 v0, v27

    move-object/from16 v27, v7

    move-object/from16 v7, v24

    move-object/from16 v24, v0

    move v2, v3

    move v3, v5

    move v5, v6

    move-object/from16 v23, v10

    move v6, v15

    move-object/from16 v0, v18

    move-object/from16 v15, v25

    move/from16 v1, v30

    move-object v10, v8

    move-object/from16 v25, v12

    move v12, v14

    .line 65
    :goto_18
    sget-object v8, Lqc/q;->a:Lqc/q;

    move v8, v12

    move-object v12, v10

    move v10, v8

    move-object/from16 v18, v0

    move-object/from16 v39, v7

    move-object/from16 v34, v21

    move/from16 v8, v26

    move-object/from16 v0, v27

    move/from16 v21, v5

    move v7, v6

    move v6, v1

    move v5, v2

    move v1, v3

    move-object/from16 v2, v19

    move-object/from16 v3, v23

    move-object/from16 v19, v24

    :goto_19
    move-object/from16 v38, v9

    move v9, v10

    move-object v14, v11

    move-object v11, v12

    move-object/from16 p1, v15

    move/from16 v15, v21

    move-object/from16 v12, v25

    move-object/from16 v21, v34

    move-object/from16 v33, v35

    move-object/from16 v10, v39

    goto/16 :goto_14

    :cond_19
    move-object/from16 v26, v0

    move/from16 v27, v1

    move-object/from16 v25, v2

    move-object/from16 v28, v3

    move/from16 v29, v5

    move v10, v9

    move-object v11, v14

    move-object/from16 v35, v33

    move-object/from16 v9, v38

    move v3, v7

    move v1, v10

    move-object v5, v13

    move v2, v15

    move-object/from16 v0, v18

    move-object/from16 v17, v20

    move-object/from16 v6, v26

    move/from16 v10, v27

    move-object/from16 v13, v28

    move/from16 v15, v29

    move-object/from16 v18, v12

    move-object/from16 v12, v25

    goto :goto_1a

    :cond_1a
    move-object v0, v11

    move-object v11, v14

    move-object/from16 v35, v33

    move-object/from16 v9, v38

    move-object v5, v10

    move v2, v15

    move/from16 v15, v21

    move/from16 v10, v22

    move-object/from16 v6, v23

    move/from16 v3, v24

    move/from16 v1, v25

    move-object/from16 v21, v18

    move-object/from16 v18, v0

    move-object/from16 v0, p1

    :goto_1a
    move-object/from16 p1, v0

    move v0, v3

    move-object v14, v9

    move-object v7, v11

    move-object/from16 v3, v18

    move-object/from16 v18, v21

    move-object/from16 v9, v31

    move-object/from16 v8, v35

    move-object/from16 v11, v37

    goto/16 :goto_5

    :cond_1b
    move/from16 v24, v0

    move/from16 v25, v1

    move-object v0, v3

    move-object/from16 v23, v6

    move-object/from16 v35, v8

    move-object/from16 v31, v9

    move-object/from16 v37, v11

    move-object v9, v14

    move-object v11, v7

    .line 66
    sget-object v1, Lqc/q;->a:Lqc/q;

    move-object/from16 v29, v12

    move-object/from16 v15, v23

    move/from16 v21, v24

    move/from16 v3, v25

    move-object/from16 v14, v31

    move-object/from16 v32, v37

    move-object v12, v0

    move-object/from16 v0, p1

    goto/16 :goto_20

    .line 67
    :goto_1b
    invoke-static {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v7

    .line 68
    new-instance v17, Lcom/friday/common/entity/ResourceEntity;

    .line 69
    sget-object v8, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v8, v37

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 70
    invoke-virtual {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    move-result-object v19

    .line 71
    invoke-static {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->j(Lcom/friday/paint/viewmodel/NoteViewModel;)J

    move-result-wide v24

    const/16 v27, 0x1

    const/16 v28, 0x0

    .line 72
    const-string v22, ""

    const-string v23, ""

    const/16 v26, 0x2

    move-object/from16 v30, v29

    move-object/from16 v20, v5

    invoke-direct/range {v17 .. v30}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 p1, v0

    move-object/from16 v14, v17

    move-object/from16 v10, v20

    move/from16 v5, v21

    move-object/from16 v13, v29

    .line 73
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->j:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->k:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->l:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->m:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->n:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->o:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->p:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->q:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->r:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->s:Ljava/lang/Object;

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    const/4 v0, 0x0

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    const/4 v0, 0x1

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v7, v14, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v11, :cond_1c

    goto/16 :goto_1e

    :cond_1c
    move-object v7, v1

    move/from16 v21, v5

    move-object/from16 v1, p1

    move v5, v3

    move v3, v2

    const/4 v2, 0x0

    goto/16 :goto_3

    .line 74
    :goto_1c
    invoke-static {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v13

    .line 75
    new-instance v17, Lcom/friday/common/entity/ResourceEntity;

    .line 76
    sget-object v14, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "actions.bin"

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 77
    invoke-virtual {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    move-result-object v19

    .line 78
    invoke-static {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->j(Lcom/friday/paint/viewmodel/NoteViewModel;)J

    move-result-wide v24

    const/16 v27, 0x1

    const/16 v28, 0x0

    .line 79
    const-string v22, ""

    const-string v23, ""

    const/16 v26, 0x1

    move-object/from16 v30, v29

    move-object/from16 v20, v10

    invoke-direct/range {v17 .. v30}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 p1, v1

    move-object/from16 v1, v17

    move/from16 v0, v21

    move-object/from16 v14, v29

    move-object/from16 v17, v6

    .line 80
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v14, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v12, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    const/4 v6, 0x2

    iput v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v13, v1, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v11, :cond_1d

    goto/16 :goto_1e

    :cond_1d
    move/from16 v21, v0

    move v0, v3

    move v1, v5

    move-object v3, v12

    move-object/from16 v29, v14

    move-object/from16 v5, v17

    move-object v12, v7

    move-object/from16 v7, p1

    .line 81
    :goto_1d
    invoke-static {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    move-result-object v13

    .line 82
    new-instance v17, Lcom/friday/common/entity/ResourceEntity;

    .line 83
    sget-object v14, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, v31

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    .line 84
    invoke-virtual {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->B()Ljava/lang/String;

    move-result-object v19

    .line 85
    invoke-static {v15}, Lcom/friday/paint/viewmodel/NoteViewModel;->j(Lcom/friday/paint/viewmodel/NoteViewModel;)J

    move-result-wide v24

    const/16 v27, 0x1

    const/16 v28, 0x0

    .line 86
    const-string v22, ""

    const-string v23, ""

    const/16 v26, 0x1

    move-object/from16 v30, v29

    move-object/from16 v20, v10

    invoke-direct/range {v17 .. v30}, Lcom/friday/common/entity/ResourceEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIZZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 p1, v17

    move-object/from16 v17, v7

    move-object/from16 v7, p1

    move-object/from16 p1, v5

    move-object/from16 v32, v8

    move-object/from16 v6, v20

    move/from16 v5, v21

    move-object/from16 v10, v29

    .line 87
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->c:Ljava/lang/Object;

    iput-object v15, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->d:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->e:Ljava/lang/Object;

    iput-object v3, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->f:Ljava/lang/Object;

    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->g:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->h:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->i:Ljava/lang/Object;

    iput v1, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->t:I

    iput v0, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->u:I

    iput v5, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->v:I

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->w:I

    const/4 v2, 0x3

    iput v2, v4, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;->B:I

    invoke-interface {v13, v7, v4}, Lcom/friday/common/dao/ResourceDao;->E(Lcom/friday/common/entity/ResourceEntity;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v11, :cond_1e

    :goto_1e
    return-object v11

    :cond_1e
    move-object v2, v6

    move-object v5, v10

    move-object v6, v15

    move-object/from16 v10, v17

    .line 88
    :goto_1f
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v7, "-----"

    invoke-static {v7, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lxc/a;->c(I)Ljava/lang/Integer;

    move/from16 v21, v0

    move-object v12, v3

    move-object/from16 v29, v5

    move-object v15, v6

    move-object v0, v10

    move v3, v1

    :goto_20
    move-object v7, v14

    move-object v14, v9

    move-object v9, v7

    move-object v7, v11

    move-object/from16 v11, v32

    move-object/from16 v8, v35

    goto/16 :goto_4

    .line 89
    :cond_1f
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
