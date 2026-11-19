.class public final synthetic Li6/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Li6/b;

.field public final synthetic c:Lkotlin/jvm/functions/Function3;

.field public final synthetic d:Ljava/util/Set;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Li6/b;Lkotlin/jvm/functions/Function3;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li6/e0;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Li6/e0;->b:Li6/b;

    iput-object p3, p0, Li6/e0;->c:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Li6/e0;->d:Ljava/util/Set;

    iput-object p5, p0, Li6/e0;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Li6/e0;->f:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iput p7, p0, Li6/e0;->g:I

    iput p8, p0, Li6/e0;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Li6/e0;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Li6/e0;->b:Li6/b;

    iget-object v2, p0, Li6/e0;->c:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Li6/e0;->d:Ljava/util/Set;

    iget-object v4, p0, Li6/e0;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Li6/e0;->f:Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;

    iget v6, p0, Li6/e0;->g:I

    iget v7, p0, Li6/e0;->h:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Li6/k0;->e(Landroidx/compose/ui/Modifier;Li6/b;Lkotlin/jvm/functions/Function3;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/guide/noStem/NoStemViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
