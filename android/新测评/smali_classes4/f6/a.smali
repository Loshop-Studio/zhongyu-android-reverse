.class public final synthetic Lf6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/Modifier;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroidx/compose/ui/Modifier;

.field public final synthetic d:Lkotlin/jvm/functions/Function3;

.field public final synthetic e:Lkotlin/jvm/functions/Function3;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/a;->a:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lf6/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lf6/a;->c:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Lf6/a;->d:Lkotlin/jvm/functions/Function3;

    iput-object p5, p0, Lf6/a;->e:Lkotlin/jvm/functions/Function3;

    iput p6, p0, Lf6/a;->f:I

    iput p7, p0, Lf6/a;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lf6/a;->a:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lf6/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lf6/a;->c:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lf6/a;->d:Lkotlin/jvm/functions/Function3;

    iget-object v4, p0, Lf6/a;->e:Lkotlin/jvm/functions/Function3;

    iget v5, p0, Lf6/a;->f:I

    iget v6, p0, Lf6/a;->g:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lf6/f;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
