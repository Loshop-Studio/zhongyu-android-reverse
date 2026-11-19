.class public final synthetic Lv6/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

.field public final synthetic b:Lv6/k0;

.field public final synthetic c:Lb7/w0;

.field public final synthetic d:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/k0;Lb7/w0;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/g0;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iput-object p2, p0, Lv6/g0;->b:Lv6/k0;

    iput-object p3, p0, Lv6/g0;->c:Lb7/w0;

    iput-object p4, p0, Lv6/g0;->d:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lv6/g0;->a:Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;

    iget-object v1, p0, Lv6/g0;->b:Lv6/k0;

    iget-object v2, p0, Lv6/g0;->c:Lb7/w0;

    iget-object v3, p0, Lv6/g0;->d:Landroidx/navigation/NavController;

    invoke-static {v0, v1, v2, v3}, Lv6/j0;->e(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lv6/k0;Lb7/w0;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
