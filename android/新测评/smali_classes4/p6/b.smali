.class public final synthetic Lp6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/b;->a:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iput-object p2, p0, Lp6/b;->b:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lp6/b;->a:Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;

    iget-object v1, p0, Lp6/b;->b:Landroidx/navigation/NavController;

    invoke-static {v0, v1}, Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuidePageKt;->b(Lcom/zykj/evaluation/ui/guide/normal/toCorrectSelf/ToCorrectSelfGuideViewModel;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
