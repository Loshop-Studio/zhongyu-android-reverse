.class public final synthetic La7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lcom/zykj/evaluation/ui/sheet/treble/TrebleViewModel;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/treble/TrebleViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La7/a;->a:Ljava/lang/String;

    iput-object p2, p0, La7/a;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, La7/a;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La7/a;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La7/a;->e:Lcom/zykj/evaluation/ui/sheet/treble/TrebleViewModel;

    iput p6, p0, La7/a;->f:I

    iput p7, p0, La7/a;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La7/a;->a:Ljava/lang/String;

    iget-object v1, p0, La7/a;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, La7/a;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, La7/a;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, La7/a;->e:Lcom/zykj/evaluation/ui/sheet/treble/TrebleViewModel;

    iget v5, p0, La7/a;->f:I

    iget v6, p0, La7/a;->g:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, La7/b;->a(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/treble/TrebleViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
