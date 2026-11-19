.class public final synthetic Li6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/navigation/NavController;

.field public final synthetic b:J

.field public final synthetic c:Lkotlin/jvm/functions/Function4;

.field public final synthetic d:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;JLkotlin/jvm/functions/Function4;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/f;->a:Landroidx/navigation/NavController;

    iput-wide p2, p0, Li6/f;->b:J

    iput-object p4, p0, Li6/f;->c:Lkotlin/jvm/functions/Function4;

    iput-object p5, p0, Li6/f;->d:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput p6, p0, Li6/f;->e:I

    iput p7, p0, Li6/f;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Li6/f;->a:Landroidx/navigation/NavController;

    iget-wide v1, p0, Li6/f;->b:J

    iget-object v3, p0, Li6/f;->c:Lkotlin/jvm/functions/Function4;

    iget-object v4, p0, Li6/f;->d:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget v5, p0, Li6/f;->e:I

    iget v6, p0, Li6/f;->f:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/ui/guide/noStem/NoStemPageKt;->i(Landroidx/navigation/NavController;JLkotlin/jvm/functions/Function4;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
