.class public final synthetic Ld6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lkotlin/jvm/functions/Function6;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

.field public final synthetic h:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ld6/h;->a:J

    iput-object p3, p0, Ld6/h;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iput-object p4, p0, Ld6/h;->c:Landroidx/navigation/NavController;

    iput-object p5, p0, Ld6/h;->d:Lkotlin/jvm/functions/Function6;

    iput-object p6, p0, Ld6/h;->e:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Ld6/h;->f:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Ld6/h;->g:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

    iput-object p9, p0, Ld6/h;->h:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iput p10, p0, Ld6/h;->i:I

    iput p11, p0, Ld6/h;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-wide v0, p0, Ld6/h;->a:J

    iget-object v2, p0, Ld6/h;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-object v3, p0, Ld6/h;->c:Landroidx/navigation/NavController;

    iget-object v4, p0, Ld6/h;->d:Lkotlin/jvm/functions/Function6;

    iget-object v5, p0, Ld6/h;->e:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ld6/h;->f:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Ld6/h;->g:Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;

    iget-object v8, p0, Ld6/h;->h:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iget v9, p0, Ld6/h;->i:I

    iget v10, p0, Ld6/h;->j:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailPageKt;->e(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
