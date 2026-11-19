.class public final synthetic Lc6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lkotlin/jvm/functions/Function7;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

.field public final synthetic h:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function7;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lc6/g;->a:J

    iput-object p3, p0, Lc6/g;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iput-object p4, p0, Lc6/g;->c:Landroidx/navigation/NavController;

    iput-object p5, p0, Lc6/g;->d:Lkotlin/jvm/functions/Function7;

    iput-object p6, p0, Lc6/g;->e:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lc6/g;->f:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lc6/g;->g:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    iput-object p9, p0, Lc6/g;->h:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

    iput p10, p0, Lc6/g;->i:I

    iput p11, p0, Lc6/g;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-wide v0, p0, Lc6/g;->a:J

    iget-object v2, p0, Lc6/g;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-object v3, p0, Lc6/g;->c:Landroidx/navigation/NavController;

    iget-object v4, p0, Lc6/g;->d:Lkotlin/jvm/functions/Function7;

    iget-object v5, p0, Lc6/g;->e:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lc6/g;->f:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lc6/g;->g:Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;

    iget-object v8, p0, Lc6/g;->h:Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;

    iget v9, p0, Lc6/g;->i:I

    iget v10, p0, Lc6/g;->j:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailPageKt;->c(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function7;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toCorrect/ToCorrectGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
