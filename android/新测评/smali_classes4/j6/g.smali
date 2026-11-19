.class public final synthetic Lj6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/g;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lj6/g;->b:Ljava/util/List;

    iput-object p3, p0, Lj6/g;->c:Ljava/util/List;

    iput-object p4, p0, Lj6/g;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lj6/g;->e:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lj6/g;->f:I

    iput p7, p0, Lj6/g;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lj6/g;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lj6/g;->b:Ljava/util/List;

    iget-object v2, p0, Lj6/g;->c:Ljava/util/List;

    iget-object v3, p0, Lj6/g;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lj6/g;->e:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lj6/g;->f:I

    iget v6, p0, Lj6/g;->g:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/ui/guide/normal/GuidePageKt;->c(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
