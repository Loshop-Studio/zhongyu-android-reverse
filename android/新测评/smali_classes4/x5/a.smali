.class public final synthetic Lx5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;

.field public final synthetic e:Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lx5/a;->a:J

    iput-object p3, p0, Lx5/a;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iput-object p4, p0, Lx5/a;->c:Landroidx/navigation/NavController;

    iput-object p5, p0, Lx5/a;->d:Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;

    iput-object p6, p0, Lx5/a;->e:Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;

    iput p7, p0, Lx5/a;->f:I

    iput p8, p0, Lx5/a;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-wide v0, p0, Lx5/a;->a:J

    iget-object v2, p0, Lx5/a;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-object v3, p0, Lx5/a;->c:Landroidx/navigation/NavController;

    iget-object v4, p0, Lx5/a;->d:Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;

    iget-object v5, p0, Lx5/a;->e:Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;

    iget v6, p0, Lx5/a;->f:I

    iget v7, p0, Lx5/a;->g:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lx5/b;->a(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/correcting/CorrectingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
