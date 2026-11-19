.class public final synthetic Lp6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:J

.field public final synthetic c:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/d;->a:Landroidx/navigation/NavController;

    iput-wide p2, p0, Lp6/d;->b:J

    iput-object p4, p0, Lp6/d;->c:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iput p5, p0, Lp6/d;->d:I

    iput p6, p0, Lp6/d;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lp6/d;->a:Landroidx/navigation/NavController;

    iget-wide v1, p0, Lp6/d;->b:J

    iget-object v3, p0, Lp6/d;->c:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iget v4, p0, Lp6/d;->d:I

    iget v5, p0, Lp6/d;->e:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->d(Landroidx/navigation/NavController;JLcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
