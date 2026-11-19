.class public final synthetic La6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

.field public final synthetic c:Landroidx/navigation/NavController;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;

.field public final synthetic g:Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La6/a;->a:J

    iput-object p3, p0, La6/a;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iput-object p4, p0, La6/a;->c:Landroidx/navigation/NavController;

    iput-object p5, p0, La6/a;->d:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La6/a;->e:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La6/a;->f:Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;

    iput-object p8, p0, La6/a;->g:Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

    iput p9, p0, La6/a;->h:I

    iput p10, p0, La6/a;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-wide v0, p0, La6/a;->a:J

    iget-object v2, p0, La6/a;->b:Lcom/zykj/evaluation/bean/bundle/DetailBundle;

    iget-object v3, p0, La6/a;->c:Landroidx/navigation/NavController;

    iget-object v4, p0, La6/a;->d:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, La6/a;->e:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, La6/a;->f:Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;

    iget-object v7, p0, La6/a;->g:Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;

    iget v8, p0, La6/a;->h:I

    iget v9, p0, La6/a;->i:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, La6/b;->a(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/revising/RevisingDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/revising/RevisingGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
