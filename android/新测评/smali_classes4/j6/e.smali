.class public final synthetic Lj6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:J

.field public final synthetic c:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/e;->a:Landroidx/navigation/NavController;

    iput-wide p2, p0, Lj6/e;->b:J

    iput-object p4, p0, Lj6/e;->c:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    iput-object p5, p0, Lj6/e;->d:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lj6/e;->e:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lj6/e;->f:I

    iput p8, p0, Lj6/e;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lj6/e;->a:Landroidx/navigation/NavController;

    iget-wide v1, p0, Lj6/e;->b:J

    iget-object v3, p0, Lj6/e;->c:Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;

    iget-object v4, p0, Lj6/e;->d:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lj6/e;->e:Lkotlin/jvm/functions/Function1;

    iget v6, p0, Lj6/e;->f:I

    iget v7, p0, Lj6/e;->g:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->b(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
