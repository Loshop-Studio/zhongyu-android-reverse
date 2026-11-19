.class public final synthetic Lv6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroidx/navigation/NavController;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/e;->a:Ljava/lang/String;

    iput-object p2, p0, Lv6/e;->b:Landroidx/navigation/NavController;

    iput-object p3, p0, Lv6/e;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lv6/e;->d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p5, p0, Lv6/e;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lv6/e;->f:Lkotlin/jvm/functions/Function0;

    iput p7, p0, Lv6/e;->g:I

    iput p8, p0, Lv6/e;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lv6/e;->a:Ljava/lang/String;

    iget-object v1, p0, Lv6/e;->b:Landroidx/navigation/NavController;

    iget-object v2, p0, Lv6/e;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lv6/e;->d:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v4, p0, Lv6/e;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lv6/e;->f:Lkotlin/jvm/functions/Function0;

    iget v6, p0, Lv6/e;->g:I

    iget v7, p0, Lv6/e;->h:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->b(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
