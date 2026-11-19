.class final Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.BaseFileViewModel$syncFileList$1$1"
    f = "BaseFileViewModel.kt"
    l = {
        0xa0,
        0xa7,
        0xae,
        0xb1,
        0xb3,
        0xc1,
        0xc4,
        0xc7
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

.field public final synthetic v:Lcom/friday/document/viewmodel/BaseFileViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->v:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->v:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;-><init>(Lcom/friday/document/viewmodel/BaseFileViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v4, p0

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v7

    .line 1
    iget v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    check-cast v1, Lcom/friday/common/entity/NoteBean;

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    check-cast v1, Lcom/friday/common/entity/FileEntity;

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    check-cast v2, Lcom/friday/document/viewmodel/BaseFileViewModel;

    iget-object v3, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    iget-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/property/BaseResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move v8, v0

    const/4 v0, 0x0

    const/16 v16, 0x5

    const/16 v17, 0x0

    const/16 v18, 0x1

    goto/16 :goto_e

    :pswitch_1
    iget v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->s:I

    iget v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    iget v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iget-object v3, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->p:Ljava/lang/Object;

    check-cast v3, Lcom/friday/common/entity/NoteBean;

    iget-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->o:Ljava/lang/Object;

    check-cast v5, Lcom/friday/common/entity/ResourceEntity;

    iget-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->m:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    check-cast v13, Lcom/friday/common/entity/FileEntity;

    iget-object v14, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    iget-object v15, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    iget-object v8, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    check-cast v8, Lcom/friday/document/viewmodel/BaseFileViewModel;

    iget-object v10, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    move/from16 v19, v0

    iget-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/property/BaseResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move/from16 v16, v2

    move v2, v1

    move/from16 v1, v19

    move-object/from16 v19, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v8

    move/from16 v8, v16

    const/16 v16, 0x5

    const/16 v18, 0x1

    goto/16 :goto_a

    :pswitch_2
    iget v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    iget v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iget-object v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    check-cast v2, Lcom/friday/common/entity/NoteBean;

    iget-object v3, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    check-cast v3, Lcom/friday/common/entity/FileEntity;

    iget-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    iget-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    check-cast v8, Lcom/friday/document/viewmodel/BaseFileViewModel;

    iget-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v10, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/property/BaseResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v14, v12

    const/16 v16, 0x5

    const/16 v18, 0x1

    move-object v12, v10

    move-object v10, v8

    move v8, v1

    move v1, v0

    move-object/from16 v0, p1

    goto/16 :goto_8

    :pswitch_3
    iget v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    check-cast v1, Lcom/friday/common/entity/FileEntity;

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    :pswitch_4
    iget v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    iget v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iget-object v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    check-cast v2, Lcom/friday/common/entity/FileEntity;

    iget-object v3, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    check-cast v3, Lcom/friday/common/entity/NoteBean;

    iget-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    iget-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v8, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    check-cast v8, Lcom/friday/document/viewmodel/BaseFileViewModel;

    iget-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v10, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    check-cast v12, Lcom/friday/common/property/BaseResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v24, v10

    move v10, v0

    move v0, v1

    move-object v1, v6

    move-object v6, v5

    move-object/from16 v5, v24

    move-object/from16 v24, v11

    move-object v11, v2

    move-object v2, v8

    move-object/from16 v8, v24

    goto/16 :goto_5

    :pswitch_5
    iget v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    check-cast v1, Lcom/friday/common/entity/FileEntity;

    :goto_0
    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    check-cast v1, Lcom/friday/common/entity/NoteBean;

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    check-cast v2, Lcom/friday/document/viewmodel/BaseFileViewModel;

    iget-object v3, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Iterable;

    iget-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v8, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    check-cast v8, Lcom/friday/common/property/BaseResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_6
    iget-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    check-cast v0, Lcom/friday/common/property/BaseResponse;

    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :pswitch_8
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->v:Lcom/friday/document/viewmodel/BaseFileViewModel;

    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->G()Ls2/a;

    move-result-object v0

    const/4 v1, 0x1

    iput v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    invoke-interface {v0, v4}, Ls2/a;->a(Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    goto/16 :goto_d

    .line 3
    :cond_0
    :goto_1
    check-cast v0, Lcom/friday/common/property/BaseResponse;

    .line 4
    invoke-virtual {v0}, Lcom/friday/common/property/BaseResponse;->getCode()I

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    .line 5
    :cond_1
    invoke-virtual {v0}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/friday/common/entity/FileBean;

    invoke-virtual {v1}, Lcom/friday/common/entity/FileBean;->getNoteList()Ljava/util/List;

    move-result-object v1

    .line 6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    .line 7
    :cond_2
    iget-object v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->v:Lcom/friday/document/viewmodel/BaseFileViewModel;

    invoke-virtual {v2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    move-result-object v2

    iget-object v3, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->v:Lcom/friday/document/viewmodel/BaseFileViewModel;

    invoke-virtual {v3}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    move-result-wide v5

    invoke-interface {v2, v5, v6}, Lcom/friday/common/dao/FileDao;->R(J)Ljava/util/List;

    move-result-object v2

    .line 8
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 9
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u672c\u5730\u5217\u8868\u4e3a\u7a7a\uff0c\u5f00\u59cb\u6279\u91cf\u63d2\u5165 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " \u4e2a\u65b0\u6587\u4ef6\u3002"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "BaseFileViewModel.kt => syncFileList"

    filled-new-array {v5, v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 10
    iget-object v3, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->v:Lcom/friday/document/viewmodel/BaseFileViewModel;

    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    invoke-static {v3, v1, v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->r(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    goto/16 :goto_d

    .line 11
    :cond_3
    :goto_2
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    .line 12
    :cond_4
    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    iget-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->v:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 13
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v8, v6

    move-object v6, v1

    move-object v1, v8

    move-object v8, v5

    move-object v5, v2

    move-object v2, v8

    move-object v8, v0

    const/4 v0, 0x0

    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/friday/common/entity/NoteBean;

    .line 14
    move-object v11, v5

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v13}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_4

    :cond_7
    const/4 v12, 0x0

    :goto_4
    move-object v11, v12

    check-cast v11, Lcom/friday/common/entity/FileEntity;

    if-nez v11, :cond_8

    .line 15
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    iput v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    const/4 v9, 0x0

    iput v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    const/4 v9, 0x3

    iput v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    invoke-static {v2, v10, v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->q(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/NoteBean;Lvc/c;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_5

    goto/16 :goto_d

    .line 16
    :cond_8
    invoke-virtual {v11}, Lcom/friday/common/entity/FileEntity;->getVersion()I

    move-result v12

    invoke-virtual {v10}, Lcom/friday/common/entity/NoteBean;->getVersion()I

    move-result v13

    if-eq v12, v13, :cond_5

    invoke-virtual {v11}, Lcom/friday/common/entity/FileEntity;->getState()I

    move-result v12

    if-nez v12, :cond_5

    .line 17
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    iput v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    const/4 v12, 0x0

    iput v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    const/4 v12, 0x4

    iput v12, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    invoke-static {v2, v10, v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->q(Lcom/friday/document/viewmodel/BaseFileViewModel;Lcom/friday/common/entity/NoteBean;Lvc/c;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v7, :cond_9

    goto/16 :goto_d

    :cond_9
    move-object v12, v8

    move-object v8, v6

    move-object v6, v9

    move-object v9, v3

    move-object v3, v10

    const/4 v10, 0x0

    .line 18
    :goto_5
    invoke-static {v2}, Lcom/friday/document/viewmodel/BaseFileViewModel;->j(Lcom/friday/document/viewmodel/BaseFileViewModel;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    move-result-object v14

    sget-object v15, Ljava/io/File;->separator:Ljava/lang/String;

    move-object/from16 p1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 19
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    iput-object v8, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    iput-object v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    iput v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iput v10, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    const/4 v6, 0x5

    iput v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    invoke-static {v2, v3, v13, v4}, Lcom/friday/document/viewmodel/BaseFileViewModel;->g(Lcom/friday/document/viewmodel/BaseFileViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_a

    goto/16 :goto_d

    :cond_a
    move-object v6, v8

    move-object v3, v9

    move-object v8, v12

    goto/16 :goto_3

    .line 20
    :cond_b
    move-object v0, v5

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->v:Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v11, v0

    move-object v10, v1

    move-object v9, v2

    move-object v12, v5

    move-object v13, v6

    move-object v14, v8

    const/4 v8, 0x0

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v0, v15

    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 22
    move-object v1, v13

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/friday/common/entity/NoteBean;

    invoke-virtual {v3}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_7

    :cond_d
    const/4 v2, 0x0

    :goto_7
    move-object/from16 v19, v2

    check-cast v19, Lcom/friday/common/entity/NoteBean;

    if-nez v19, :cond_15

    .line 23
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getState()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_14

    .line 24
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getState()I

    move-result v1

    const/16 v3, 0xa

    if-eq v1, v3, :cond_14

    .line 25
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getState()I

    move-result v1

    const/4 v3, 0x5

    if-eq v1, v3, :cond_13

    .line 26
    invoke-virtual {v10}, Lcom/friday/document/viewmodel/BaseFileViewModel;->U()Lcom/friday/common/dao/ResourceDao;

    move-result-object v1

    move-object v5, v1

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    iput-object v13, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    iput v8, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    const/4 v6, 0x0

    iput v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    const/4 v6, 0x6

    iput v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    move/from16 v18, v2

    move/from16 v16, v3

    const-wide/16 v2, 0x0

    move-object v6, v0

    move-object v0, v5

    const/4 v5, 0x2

    move-object/from16 v20, v6

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->Q(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_e

    goto/16 :goto_d

    :cond_e
    move-object v6, v9

    move-object v9, v11

    move-object v11, v13

    move-object v5, v15

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    const/4 v1, 0x0

    .line 27
    :goto_8
    check-cast v0, Ljava/util/List;

    .line 28
    move-object v13, v0

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_11

    .line 29
    move-object v13, v0

    check-cast v13, Ljava/lang/Iterable;

    .line 30
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    move-object/from16 p1, v13

    move-object v13, v0

    move-object v0, v6

    move-object/from16 v6, p1

    move-object/from16 p1, v15

    move-object v15, v5

    move-object/from16 v5, p1

    move-object/from16 p1, v11

    move-object v11, v9

    move-object/from16 v9, p1

    move-object/from16 p1, v14

    move-object v14, v3

    move-object v3, v2

    move v2, v1

    const/4 v1, 0x0

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v19

    check-cast v20, Lcom/friday/common/entity/ResourceEntity;

    move-object/from16 v21, v3

    .line 31
    invoke-virtual {v10}, Lcom/friday/document/viewmodel/BaseFileViewModel;->U()Lcom/friday/common/dao/ResourceDao;

    move-result-object v3

    move-object/from16 v22, v6

    invoke-virtual/range {v20 .. v20}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v23, v11

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    iput-object v9, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    iput-object v14, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    iput-object v5, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->m:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->n:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->o:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->p:Ljava/lang/Object;

    iput v8, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iput v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    iput v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->s:I

    const/4 v11, 0x0

    iput v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->t:I

    const/4 v11, 0x7

    iput v11, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    invoke-interface {v3, v6, v4}, Lcom/friday/common/dao/ResourceDao;->Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_f

    goto/16 :goto_d

    :cond_f
    move-object/from16 v19, v15

    move-object/from16 v3, v21

    move-object/from16 v6, v22

    move-object/from16 v11, v23

    move-object v15, v0

    move-object/from16 v0, p1

    :goto_a
    move-object/from16 p1, v0

    move-object v0, v15

    move-object/from16 v15, v19

    goto/16 :goto_9

    :cond_10
    move-object/from16 v21, v3

    move-object/from16 v23, v11

    move-object v1, v0

    move-object v6, v9

    move-object v5, v12

    move-object v0, v13

    move-object v3, v14

    move-object/from16 v12, p1

    :goto_b
    const/16 v17, 0x0

    goto :goto_c

    :cond_11
    move-object/from16 v21, v2

    move-object v15, v5

    move-object/from16 v23, v9

    move-object v5, v12

    move-object v12, v14

    move v2, v1

    move-object v1, v6

    move-object v6, v11

    goto :goto_b

    .line 32
    :goto_c
    invoke-virtual {v10}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    move-result-object v9

    invoke-virtual {v3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->c:Ljava/lang/Object;

    iput-object v6, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->d:Ljava/lang/Object;

    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->e:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->f:Ljava/lang/Object;

    iput-object v10, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->g:Ljava/lang/Object;

    iput-object v1, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->h:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->i:Ljava/lang/Object;

    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->j:Ljava/lang/Object;

    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->k:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->l:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->m:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->n:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->o:Ljava/lang/Object;

    iput-object v0, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->p:Ljava/lang/Object;

    iput v8, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->q:I

    iput v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->r:I

    const/16 v2, 0x8

    iput v2, v4, Lcom/friday/document/viewmodel/BaseFileViewModel$syncFileList$1$1;->u:I

    invoke-interface {v9, v11, v4}, Lcom/friday/common/dao/FileDao;->P(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_12

    :goto_d
    return-object v7

    :cond_12
    move-object v2, v10

    move-object/from16 v3, v23

    :goto_e
    move-object v9, v1

    move-object v10, v2

    move-object v11, v3

    move-object v13, v6

    move-object v14, v12

    move-object v12, v5

    goto/16 :goto_6

    :cond_13
    move/from16 v18, v2

    move/from16 v16, v3

    const/4 v0, 0x0

    :goto_f
    const/16 v17, 0x0

    goto/16 :goto_6

    :cond_14
    move/from16 v18, v2

    const/4 v0, 0x0

    const/16 v16, 0x5

    goto :goto_f

    :cond_15
    const/4 v0, 0x0

    const/16 v16, 0x5

    const/16 v17, 0x0

    const/16 v18, 0x1

    goto/16 :goto_6

    .line 33
    :cond_16
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
