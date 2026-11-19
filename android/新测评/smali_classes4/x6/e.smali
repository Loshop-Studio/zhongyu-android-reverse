.class public final synthetic Lx6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lx6/e;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Lx6/e;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lx6/e;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lx6/e;->e:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iput p6, p0, Lx6/e;->f:I

    iput p7, p0, Lx6/e;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lx6/e;->a:Ljava/lang/String;

    iget-object v1, p0, Lx6/e;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Lx6/e;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lx6/e;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lx6/e;->e:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget v5, p0, Lx6/e;->f:I

    iget v6, p0, Lx6/e;->g:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lx6/f;->a(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
