.class public final synthetic Lw5/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

.field public final synthetic f:Lkotlin/jvm/functions/Function4;

.field public final synthetic g:Lkotlin/jvm/functions/Function2;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Lkotlin/jvm/functions/Function2;

.field public final synthetic j:Lkotlin/jvm/functions/Function2;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;

.field public final synthetic m:Lkotlin/jvm/functions/Function1;

.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lw5/b1;->a:J

    iput-object p3, p0, Lw5/b1;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iput-object p4, p0, Lw5/b1;->c:Landroidx/navigation/NavController;

    iput-object p5, p0, Lw5/b1;->d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p6, p0, Lw5/b1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    iput-object p7, p0, Lw5/b1;->f:Lkotlin/jvm/functions/Function4;

    iput-object p8, p0, Lw5/b1;->g:Lkotlin/jvm/functions/Function2;

    iput-object p9, p0, Lw5/b1;->h:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lw5/b1;->i:Lkotlin/jvm/functions/Function2;

    iput-object p11, p0, Lw5/b1;->j:Lkotlin/jvm/functions/Function2;

    iput-object p12, p0, Lw5/b1;->k:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, Lw5/b1;->l:Lkotlin/jvm/functions/Function1;

    iput-object p14, p0, Lw5/b1;->m:Lkotlin/jvm/functions/Function1;

    iput p15, p0, Lw5/b1;->n:I

    move/from16 p1, p16

    iput p1, p0, Lw5/b1;->o:I

    move/from16 p1, p17

    iput p1, p0, Lw5/b1;->p:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    iget-wide v1, v0, Lw5/b1;->a:J

    iget-object v3, v0, Lw5/b1;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-object v4, v0, Lw5/b1;->c:Landroidx/navigation/NavController;

    iget-object v5, v0, Lw5/b1;->d:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v6, v0, Lw5/b1;->e:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    iget-object v7, v0, Lw5/b1;->f:Lkotlin/jvm/functions/Function4;

    iget-object v8, v0, Lw5/b1;->g:Lkotlin/jvm/functions/Function2;

    iget-object v9, v0, Lw5/b1;->h:Lkotlin/jvm/functions/Function1;

    iget-object v10, v0, Lw5/b1;->i:Lkotlin/jvm/functions/Function2;

    iget-object v11, v0, Lw5/b1;->j:Lkotlin/jvm/functions/Function2;

    iget-object v12, v0, Lw5/b1;->k:Lkotlin/jvm/functions/Function1;

    iget-object v13, v0, Lw5/b1;->l:Lkotlin/jvm/functions/Function1;

    iget-object v14, v0, Lw5/b1;->m:Lkotlin/jvm/functions/Function1;

    iget v15, v0, Lw5/b1;->n:I

    move-wide/from16 v16, v1

    iget v1, v0, Lw5/b1;->o:I

    iget v2, v0, Lw5/b1;->p:I

    move-object/from16 v18, p1

    check-cast v18, Landroidx/compose/runtime/Composer;

    move-object/from16 v19, p2

    check-cast v19, Ljava/lang/Integer;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    move-result v19

    move-wide/from16 v20, v16

    move/from16 v16, v1

    move/from16 v17, v2

    move-wide/from16 v1, v20

    invoke-static/range {v1 .. v19}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->o(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object v1

    return-object v1
.end method
