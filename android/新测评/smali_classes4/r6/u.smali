.class public final synthetic Lr6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/u;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lr6/u;->b:Ljava/lang/String;

    iput-object p3, p0, Lr6/u;->c:Ljava/lang/String;

    iput-object p4, p0, Lr6/u;->d:Ljava/lang/String;

    iput-object p5, p0, Lr6/u;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lr6/u;->f:Lkotlin/jvm/functions/Function0;

    iput p7, p0, Lr6/u;->g:I

    iput p8, p0, Lr6/u;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lr6/u;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lr6/u;->b:Ljava/lang/String;

    iget-object v2, p0, Lr6/u;->c:Ljava/lang/String;

    iget-object v3, p0, Lr6/u;->d:Ljava/lang/String;

    iget-object v4, p0, Lr6/u;->e:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lr6/u;->f:Lkotlin/jvm/functions/Function0;

    iget v6, p0, Lr6/u;->g:I

    iget v7, p0, Lr6/u;->h:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/guide/widget/LeftViewsKt;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
