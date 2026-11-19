.class public final synthetic Ly5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Z

.field public final synthetic c:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

.field public final synthetic d:Landroidx/navigation/NavController;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

.field public final synthetic h:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(JZLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ly5/a;->a:J

    iput-boolean p3, p0, Ly5/a;->b:Z

    iput-object p4, p0, Ly5/a;->c:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iput-object p5, p0, Ly5/a;->d:Landroidx/navigation/NavController;

    iput-object p6, p0, Ly5/a;->e:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Ly5/a;->f:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Ly5/a;->g:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    iput-object p9, p0, Ly5/a;->h:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    iput p10, p0, Ly5/a;->i:I

    iput p11, p0, Ly5/a;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-wide v0, p0, Ly5/a;->a:J

    iget-boolean v2, p0, Ly5/a;->b:Z

    iget-object v3, p0, Ly5/a;->c:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-object v4, p0, Ly5/a;->d:Landroidx/navigation/NavController;

    iget-object v5, p0, Ly5/a;->e:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ly5/a;->f:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Ly5/a;->g:Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    iget-object v8, p0, Ly5/a;->h:Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    iget v9, p0, Ly5/a;->i:I

    iget v10, p0, Ly5/a;->j:I

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailPageKt;->a(JZLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
